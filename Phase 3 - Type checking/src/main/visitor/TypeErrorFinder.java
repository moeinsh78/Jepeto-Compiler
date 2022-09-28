package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListType;
import main.ast.types.single.BoolType;
import main.ast.types.single.IntType;
import main.ast.types.single.StringType;
import main.compileErrors.typeErrors.*;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;

import java.lang.invoke.StringConcatFactory;
import java.util.*;
import java.util.stream.StreamSupport;


public class TypeErrorFinder extends Visitor<Void> {
    private ExpressionTypeErrorFinder exprErrorFinder = new ExpressionTypeErrorFinder();
    private FunctionSymbolTableItem visitingFunction;

    public void setVisitingFunction(FunctionSymbolTableItem vf) {
        this.visitingFunction = vf;
    }

    @Override
    public Void visit(Program program) {
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        if (!funcDeclaration.getVisited()) {
            try {
                String visitingFuncKey = "Function_" + funcDeclaration.getFunctionName().getName();
                FunctionSymbolTableItem visitingFuncItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(visitingFuncKey);
                this.visitingFunction = visitingFuncItem;
                exprErrorFinder.setVisitingFunction(visitingFuncItem);
            } catch (ItemNotFoundException ignored) {}

            funcDeclaration.setVisited();
            funcDeclaration.getBody().accept(this);
        }
        return null;
    }
    @Override

    public Void visit(MainDeclaration mainDeclaration) {
        mainDeclaration.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for(Statement statement : blockStmt.getStatements()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type condType = conditionalStmt.getCondition().accept(exprErrorFinder);
        if (!(condType instanceof BoolType) && !(condType instanceof NoType)) {
            ConditionNotBool exception = new ConditionNotBool(conditionalStmt.getLine());
            conditionalStmt.addError(exception);
        }
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt funcCallStmt) {
        exprErrorFinder.setIsCallStmt(true);
        funcCallStmt.getFunctionCall().accept(exprErrorFinder);
        exprErrorFinder.setIsCallStmt(false);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        Type printType = print.getArg().accept(exprErrorFinder);
        if(!(printType instanceof BoolType || printType instanceof IntType || printType instanceof StringType
                || printType instanceof ListType || printType instanceof NoType)) {

            UnsupportedTypeForPrint exception = new UnsupportedTypeForPrint(print.getLine());
            print.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type returnType = returnStmt.getReturnedExpr().accept(exprErrorFinder);
        Type itemRetType = visitingFunction.getReturnType();
        if(returnType instanceof FptrType && itemRetType instanceof FptrType) {
            if(!exprErrorFinder.functionPtrEqual((FptrType) returnType, (FptrType) itemRetType)) {
                ReturnValueNotMatchFunctionReturnType exception = new ReturnValueNotMatchFunctionReturnType
                        (returnStmt.getReturnedExpr().getLine());
                returnStmt.addError(exception);
            }
            return null;
        }
        else if (!(returnType.getClass().equals(itemRetType.getClass())) && !(returnType instanceof NoType)) {
            ReturnValueNotMatchFunctionReturnType exception = new ReturnValueNotMatchFunctionReturnType
                    (returnStmt.getReturnedExpr().getLine());
            returnStmt.addError(exception);
        }
        return null;
    }
}
