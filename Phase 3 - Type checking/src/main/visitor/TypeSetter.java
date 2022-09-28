package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.single.BoolType;
import main.compileErrors.typeErrors.*;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;
import java.util.*;

public class TypeSetter extends Visitor<Void> {
    private TypeInference typeInference = new TypeInference();
    private FunctionSymbolTableItem visitingFunction;

    public void setVisitingFunction(FunctionSymbolTableItem vf) {
        this.visitingFunction = vf;
    }

    public void anonymousResetVisited() {
        int anonymousIndex = 1;
        while(true) {
            try {
                String anonymousFuncKey = "Function_anonymous" + anonymousIndex;
                FunctionSymbolTableItem funcItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(anonymousFuncKey);
                funcItem.getFuncDeclaration().resetVisited();
                anonymousIndex++;
            } catch(ItemNotFoundException exception) {
                return;
            }
        }
    }

    public void setNullTypeFuncRetType(ArrayList<FunctionDeclaration> funcDecs) {
        for(FunctionDeclaration funcDec: funcDecs) {
            if (funcDec.getVisited()) {
                try {
                    FunctionSymbolTableItem funcItem = (FunctionSymbolTableItem)
                            SymbolTable.root.getItem("Function_" + funcDec.getFunctionName().getName());
                    if (funcItem.getReturnType() == null)
                        funcItem.setReturnType(new NoType());
                } catch(ItemNotFoundException ignored) {}
            }
        }
    }

    public void printFuncInfo(ArrayList<FunctionDeclaration> funcDecs) {
        for (FunctionDeclaration funcDec: funcDecs) {
            if (funcDec.getVisited()) {
                FunctionSymbolTableItem funcItem;
                try {
                    funcItem = (FunctionSymbolTableItem)
                            SymbolTable.root.getItem("Function_" + funcDec.getFunctionName().getName());
                    System.out.println(funcDec.getFunctionName().getName());
                    System.out.println(funcItem.getArgTypes());
                    System.out.println(funcItem.getReturnType().toString());
                } catch (ItemNotFoundException ignored) {}

            }
        }
    }

    public Void visit(Program program) {
        program.getMain().accept(this);
        for (FunctionDeclaration funcDec: program.getFunctions())
            funcDec.resetVisited();
        anonymousResetVisited();

        program.getMain().accept(this);
        setNullTypeFuncRetType(program.getFunctions());
        printFuncInfo(program.getFunctions());
        for (FunctionDeclaration funcDec: program.getFunctions())
            funcDec.resetVisited();
        anonymousResetVisited();
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        if (!funcDeclaration.getVisited()) {
            try {
                String visitingFuncKey = "Function_" + funcDeclaration.getFunctionName().getName();
                FunctionSymbolTableItem visitingFuncItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(visitingFuncKey);
                this.visitingFunction = visitingFuncItem;
                typeInference.setVisitingFunction(visitingFuncItem);
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
        conditionalStmt.getCondition().accept(typeInference);
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt funcCallStmt) {
        typeInference.setIsCallStmt(true);
        funcCallStmt.getFunctionCall().accept(typeInference);
        typeInference.setIsCallStmt(false);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        print.getArg().accept(typeInference);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type returnType = returnStmt.getReturnedExpr().accept(typeInference);
        Type itemRetType = visitingFunction.getReturnType();
        if(itemRetType == null || (itemRetType instanceof NoType && !(returnType instanceof NoType)))
            visitingFunction.setReturnType(returnType);

        return null;
    }
}
