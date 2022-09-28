package main.visitor;

import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.types.*;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListType;
import main.ast.types.single.*;
import main.compileErrors.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;
import java.util.*;

public class TypeInference extends Visitor<Type> {
    private FunctionSymbolTableItem visitingFunction;
    private boolean callIsStmt = false;

    public void setIsCallStmt(boolean flag) {
        this.callIsStmt = flag;
    }

    public void setVisitingFunction(FunctionSymbolTableItem visitingFunction) {
        this.visitingFunction = visitingFunction;
    }

    public boolean functionPtrEqual(FptrType t1, FptrType t2) {
        if(t1.getFunctionName().equals(t2.getFunctionName()))
            return true;
        try {
            String firstFuncKey = "Function_" + t1.getFunctionName();
            FunctionSymbolTableItem firstFuncItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(firstFuncKey);
            String secondFuncKey = "Function_" + t2.getFunctionName();
            FunctionSymbolTableItem secondFuncItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(secondFuncKey);
            if(firstFuncItem.getFuncDeclaration().getArgs().size() == secondFuncItem.getFuncDeclaration().getArgs().size()) {
                int i = 0;
                for (Type argType: firstFuncItem.getArgTypes()) {
                    if(areEqual(argType, secondFuncItem.getArgTypes().get(i)))
                        i++;
                    else return false;
                }
                if (!areEqual(firstFuncItem.getReturnType(), secondFuncItem.getReturnType()))
                    return false;
            }
            else
                return false;
        } catch (ItemNotFoundException ignored) {}

        return true;
    }

    public boolean areEqual(Type t1, Type t2) {
        if(t1 instanceof ListType && t2 instanceof ListType)
            return areEqual(((ListType) t1).getType(), ((ListType) t2).getType());
        if(t1 instanceof ListType && (!(t2 instanceof NoType)))
            return false;
        if(t2 instanceof ListType && (!(t1 instanceof NoType)))
            return false;
        if(t1 instanceof FptrType && t2 instanceof FptrType)
            return functionPtrEqual(((FptrType) t1), ((FptrType) t2));
        return (t1.getClass().equals(t2.getClass())
                || t1 instanceof NoType || t2 instanceof NoType);
    }

    public boolean setArgumentTypeByIndex(String functionKey, ArrayList<Type> argumentTypes) {
        try {
            FunctionSymbolTableItem funcItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(functionKey);
            SymbolTable funcST = funcItem.getFunctionSymbolTable();
            if(argumentTypes.size() != funcItem.getFuncDeclaration().getArgs().size())
                return false;
            if (funcItem.getFuncDeclaration().getCalledBefore()) {
                int index = 0;
                for (Type argumentType: funcItem.getArgTypes()) {
                    if(!areEqual(argumentType, argumentTypes.get(index)))
                        return false;
                    index++;
                }
                return true;
            }
            int index = 0;
            for (Type argumentType: argumentTypes) {
                funcItem.addArgType(argumentType);
                String varKey = "Var_" + funcItem.getFuncDeclaration().getArgs().get(index).getName();
                VariableSymbolTableItem varItem = (VariableSymbolTableItem) funcST.getItem(varKey);
                varItem.setType(argumentType);
                index++;
            }
            funcItem.getFuncDeclaration().setCalledBefore();
        } catch (ItemNotFoundException ignored) {}

        return true;
    }

    public boolean setArgumentTypeByKeyName(ArrayList<String> argumentNames, ArrayList<Type> argumentTypes, String functionKey) {
        try {
            FunctionSymbolTableItem funcItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(functionKey);
            if (funcItem.getFuncDeclaration().getCalledBefore()) {
                int funcArgIndex = 0;
                for (Identifier identifier : funcItem.getFuncDeclaration().getArgs()) {
                    int index = 0;
                    for (String argName : argumentNames) {
                        if (argName.equals(identifier.getName())) {
                            if (!areEqual(argumentTypes.get(index), funcItem.getArgTypes().get(funcArgIndex)))
                                return false;
                        }
                        index++;
                    }
                    funcArgIndex++;
                }
                return true;
            }
            SymbolTable funcST = funcItem.getFunctionSymbolTable();
            for (Identifier identifier : funcItem.getFuncDeclaration().getArgs()) {
                int index = 0;
                for (String argName : argumentNames) {
                    if (argName.equals(identifier.getName())) {
                        funcItem.addArgType(argumentTypes.get(index));
                        String varKey = "Var_" + argName;
                        VariableSymbolTableItem varItem = (VariableSymbolTableItem) funcST.getItem(varKey);
                        varItem.setType(argumentTypes.get(index));
                        break;
                    }
                    index++;
                }
            }
            funcItem.getFuncDeclaration().setCalledBefore();
        } catch (ItemNotFoundException ignored) {}

        return true;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Expression left = binaryExpression.getFirstOperand();
        Expression right = binaryExpression.getSecondOperand();

        Type tl = left.accept(this);
        Type tr = right.accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();


        if (operator.equals(BinaryOperator.and) || operator.equals(BinaryOperator.or)){
            if (tl instanceof BoolType && tr instanceof BoolType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof BoolType) && (tr instanceof BoolType || tr instanceof NoType))
                return new NoType();
        }
        else if (operator.equals(BinaryOperator.add) || operator.equals(BinaryOperator.sub)
                || operator.equals(BinaryOperator.mult) || operator.equals(BinaryOperator.div)) {

            if (tl instanceof IntType && tr instanceof IntType)
                return new IntType();

            if ((tl instanceof NoType || tl instanceof IntType) && (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }
        else if (operator.equals(BinaryOperator.lt) || operator.equals(BinaryOperator.gt)) {
            if (tl instanceof IntType && tr instanceof IntType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof IntType) && (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }
        else if (operator.equals(BinaryOperator.append)) {
            if(tl instanceof NoType)
                return new NoType();
            if(tl instanceof ListType) {
                if (tr instanceof NoType) {
                    return tl;
                }
                if (((ListType) tl).getType() instanceof NoType)
                    return new ListType(tr);
                if (areEqual(tr, ((ListType) tl).getType()))
                    return tl;
            }
            return new NoType();
        }
        else if (operator.equals(BinaryOperator.eq) || operator.equals(BinaryOperator.neq)) {
            if (tl instanceof NoType || tr instanceof NoType) {
                return new NoType();
            }
            if (tl instanceof FptrType) {
                if(tr instanceof FptrType) {
                    if(functionPtrEqual((FptrType) tl, (FptrType) tr))
                        return new BoolType();
                    else return new NoType();
                }
                if (tr instanceof VoidType) {
                    return new BoolType();
                }
            }
            if (tl instanceof VoidType && tr instanceof FptrType ){
                return new BoolType();
            }
            if (tl.getClass().equals(tr.getClass())) {
                if(!(tl instanceof ListType))
                    return new BoolType();
            }
        }
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        Expression operand = unaryExpression.getOperand();
        UnaryOperator operator = unaryExpression.getOperator();

        Type operand_type = operand.accept(this);

        if (operator.equals(UnaryOperator.minus)){
            if (operand_type instanceof IntType)
                return new IntType();

            if (operand_type instanceof NoType)
                return new NoType();
        }
        else if (operator.equals(UnaryOperator.not)) {
            if (operand_type instanceof BoolType)
                return new BoolType();

            if (operand_type instanceof NoType)
                return new NoType();
        }
        return new NoType();
    }

    @Override
    public Type visit(AnonymousFunction anonymousFunction) {
        String anonymousName = "Function_" + anonymousFunction.getName();
        try {
            SymbolTable.root.getItem(anonymousName);
            return new FptrType(anonymousFunction.getName());
        } catch(ItemNotFoundException ignored) {}
        return new NoType();
    }

    @Override
    public Type visit(Identifier identifier) {
        try {
            String funcKey = "Function_" + identifier.getName();
            SymbolTable.root.getItem(funcKey);
            return new FptrType(identifier.getName());
        } catch(ItemNotFoundException exception) {
            try {
                String varKey = "Var_" + identifier.getName();
                VariableSymbolTableItem varItem = (VariableSymbolTableItem) visitingFunction.getFunctionSymbolTable().getItem(varKey);
                return varItem.getType();
            } catch (ItemNotFoundException ignored) {}
        }
        return new NoType();
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        Type indexType = listAccessByIndex.getIndex().accept(this);
        Type instanceType = listAccessByIndex.getInstance().accept(this);
        if (instanceType instanceof ListType && indexType instanceof IntType)
            return ((ListType) instanceType).getType();

        return new NoType();
    }

    @Override
    public Type visit(ListSize listSize) {
        Type instanceType = listSize.getInstance().accept(this);
        if (instanceType instanceof ListType)
            return new IntType();

        return new NoType();
    }

    @Override
    public Type visit(FunctionCall funcCall) {

        boolean savedIsStmtFlag = false;
        if(callIsStmt) {
            savedIsStmtFlag = true;
            callIsStmt = false;
        }
        Type instanceType = funcCall.getInstance().accept(this);
        if (instanceType instanceof NoType)
            return new NoType();
        if (!(instanceType instanceof FptrType))
            return new NoType();

        String funcKey = "Function_" + ((FptrType) instanceType).getFunctionName();
        if (funcCall.getArgs().size() > 0) {
            ArrayList<Type> argumentTypes = new ArrayList<>();
            for (Expression argument: funcCall.getArgs()) {
                Type argType = argument.accept(this);
                argumentTypes.add(argType);
            }
            if(!setArgumentTypeByIndex(funcKey, argumentTypes))
                return new NoType();
        }
        else if (funcCall.getArgsWithKey().size() > 0) {
            ArrayList<Type> argumentTypes = new ArrayList<>();
            ArrayList<String> argumentNames = new ArrayList<>();
            for (Map.Entry<Identifier, Expression> entry : funcCall.getArgsWithKey().entrySet()) {
                Type argType = entry.getValue().accept(this);
                argumentNames.add(entry.getKey().getName());
                argumentTypes.add(argType);
            }
            if(!setArgumentTypeByKeyName(argumentNames, argumentTypes, funcKey))
                return new NoType();
        }
        else {
            if(!setArgumentTypeByIndex(funcKey, new ArrayList<>()))
                return new NoType();
        }
        Type returnType = null;
        try {
            FunctionSymbolTableItem funcItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(funcKey);
            TypeSetter typeSetter = new TypeSetter();
            typeSetter.setVisitingFunction(funcItem);
            funcItem.getFuncDeclaration().accept(typeSetter);
            returnType = funcItem.getReturnType();
        } catch(ItemNotFoundException ignored) {}

        if (!savedIsStmtFlag && returnType instanceof VoidType)
            return new NoType();
        return returnType;
    }

    @Override
    public Type visit(ListValue listValue) {
        ListType listType = null;
        for (Expression element: listValue.getElements()) {
            Type elementType = element.accept(this);
            if (elementType instanceof NoType)
                continue;
            if (listType != null && !(areEqual(elementType, listType.getType())))
                return new NoType();
            if (listType == null) listType = new ListType(elementType);
        }
        if (listType == null)
            return new ListType(new NoType());
        return listType;
    }

    @Override
    public Type visit(IntValue intValue) {
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        return new BoolType();
    }

    @Override
    public Type visit(StringValue stringValue) {
        return new StringType();
    }

    @Override
    public Type visit(VoidValue voidValue) {
        return new VoidType();
    }
}
