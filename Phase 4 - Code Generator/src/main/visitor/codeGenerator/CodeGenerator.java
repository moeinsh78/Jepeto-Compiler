package main.visitor.codeGenerator;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.functionPointer.*;
import main.ast.types.list.*;
import main.ast.types.single.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;

import java.io.*;
import java.util.*;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final ExpressionTypeChecker expressionTypeChecker;
    private FunctionDeclaration curFuncDec;
    private MainDeclaration mainDeclaration;
    private boolean is_main = false;
    private Set<String> visited;
    private int used_labels = 0;

    public String generateFreshLabel() {
        String fresh = "Label_" + Integer.toString(used_labels);
        used_labels++;
        return fresh;
    }

    public String getType(Type element) {
        String type = "";
        if(element instanceof StringType) type += "Ljava/lang/String;";
        else if(element instanceof IntType) type += "Ljava/lang/Integer;";
        else if(element instanceof FptrType) type += "LFptr;";
        else if(element instanceof ListType) type += "LList;";
        else if(element instanceof BoolType) type += "Ljava/lang/Boolean;";
        else if(element instanceof VoidType) type += "V";
        return type;
    }

    public CodeGenerator(ExpressionTypeChecker expressionTypeChecker, Set<String> type_setter_visited) {
        this.expressionTypeChecker = expressionTypeChecker;
        this.visited = type_setter_visited;
        outputPath = "./output/";
        prepareOutputFolder();
    }

    private void prepareOutputFolder() {
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {//unreachable
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e) {//unreachable
        }
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {//never reached
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    private void addStaticMainMethod() {
        // me
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    private int slotOf(String identifier) {
        if(identifier.equals("")) {
            if(is_main)
                return this.mainDeclaration.get_next_temp_index();
            return curFuncDec.getArgs().size() + curFuncDec.get_next_temp_index();
        }
        else {
            int slot_num = 1;
            for (Identifier argument: curFuncDec.getArgs()) {
                if(argument.getName().equals(identifier))
                    return slot_num;
                slot_num++;
            }
        }
        return -1;
    }

    @Override
    public String visit(Program program) {
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        addStaticMainMethod();
        for(String function_name: this.visited) {
            String func_key = "Function_" + function_name;
            try {
                FunctionSymbolTableItem funcST = (FunctionSymbolTableItem) SymbolTable.root.getItem(func_key);
                FunctionDeclaration funcDec = funcST.getFuncDeclaration();
                this.curFuncDec = funcDec;
                this.expressionTypeChecker.setCurFunction(funcST);
                funcDec.accept(this);
            } catch(ItemNotFoundException ignored) {}
        }
        this.mainDeclaration = program.getMain();
        this.is_main = true;
        program.getMain().accept(this);
        return null;
    }

    @Override
    public String visit(FunctionDeclaration funcDeclaration) {
        String commands = "";
        commands += ".method public " + funcDeclaration.getFunctionName().getName() + "(";

        FunctionSymbolTableItem funcSymbolItem;
        try {
            String func_key = "Function_" + funcDeclaration.getFunctionName().getName();
            funcSymbolItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(func_key);
            for (Identifier arg : funcDeclaration.getArgs()) {
                Type argType = funcSymbolItem.getArgTypes().get(arg.getName()); // ??
                commands += getType(argType);
            }
            commands += ")";
            assert funcSymbolItem != null;
            commands += getType(funcSymbolItem.getReturnType()) + "\n";
            commands += ".limit stack 128\n";
            commands += ".limit locals 128\n";
            commands += funcDeclaration.getBody().accept(this);
            commands += ".end method\n";
        } catch (ItemNotFoundException ignored){}

        addCommand(commands);
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        commands += mainDeclaration.getBody().accept(this);
        commands += "return\n";
        commands += ".end method\n";
        addCommand(commands);
        return null;
    }


    @Override
    public String visit(BlockStmt blockStmt) {
        String commands = "";
        for(Statement statement : blockStmt.getStatements()) {
            commands += statement.accept(this);
        }
        return commands;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        String else_label = generateFreshLabel();
        String after_else = generateFreshLabel();
        String commands = conditionalStmt.getCondition().accept(this);
        commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
        commands += "ifeq " + else_label + "\n";
        commands += conditionalStmt.getThenBody().accept(this);
        commands += "goto " + after_else + "\n";
        commands += else_label + ":\n";
        if(conditionalStmt.getElseBody() != null) {
            commands += conditionalStmt.getElseBody().accept(this);
        }
        commands += after_else + ":\n";

        return commands;
    }

    @Override
    public String visit(FunctionCallStmt funcCallStmt) {
        expressionTypeChecker.setFunctioncallStmt(true);
        String commands = funcCallStmt.getFunctionCall().accept(this);
        commands += "pop\n";
        expressionTypeChecker.setFunctioncallStmt(false);
        return commands;
    }

    @Override
    public String visit(PrintStmt print) {
        Type argType = print.getArg().accept(expressionTypeChecker);
        String commands = "";
        if(!(argType instanceof ListType))
            commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        commands += print.getArg().accept(this);
        if(argType instanceof IntType) {
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += "invokevirtual java/io/PrintStream/println(I)V\n";
        }
        if(argType instanceof BoolType) {
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            commands += "invokevirtual java/io/PrintStream/println(Z)V\n";
        }
        if(argType instanceof StringType) {
            commands += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
        }
        else if(argType instanceof ListType) {
            commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
            commands += "ldc \"[\"" + "\n" ;
            commands += "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n";

            int counter_slot = slotOf("");
            String counter_load_command;
            commands += "iconst_0\n";
            if(counter_slot > 3) {
                commands += "istore " + counter_slot + "\n";
                counter_load_command = "iload " + counter_slot + "\n";
            } else {
                commands += "istore_" + counter_slot + "\n";
                counter_load_command = "iload_" + counter_slot + "\n";
            }
            int list_element_slot = slotOf("");
            String element_load_command;
            String element_store_command;
            if(list_element_slot > 3) {
                element_load_command = "iload " + counter_slot + "\n";
                element_store_command = "istore " + counter_slot + "\n";
            } else {
                element_load_command = "iload_" + counter_slot + "\n";
                element_store_command = "istore_" + counter_slot + "\n";
            }

            String body_label = generateFreshLabel();
            String cond_label = generateFreshLabel();
            String comma_label = generateFreshLabel();
            String end_label = generateFreshLabel();

            commands += "goto " + cond_label + "\n";

            commands += body_label + ":\n";
            commands += "dup\n";
            commands += counter_load_command;
            commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
            commands += "checkcast java/lang/Integer\n";
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += element_store_command;
            commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
            commands += element_load_command;
            commands += "invokevirtual java/io/PrintStream/print(I)V\n";
            commands += "iinc " + counter_slot + " 0\n";

            commands += "dup\n";
            commands += "invokevirtual List/getSize()I\n";
            commands += counter_load_command;
            commands += "if_icmpeq " + end_label + "\n";
            commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
            commands += "ldc \",\"" + "\n";
            commands += "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n";

            commands += cond_label + ":\n";
            commands += "dup\n";
            commands += "invokevirtual List/getSize()I\n";
            commands += counter_load_command;
            commands += "if_icmpgt " + body_label + "\n";
            commands += "goto " + end_label + "\n";

            commands += end_label + ":\n";
            commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
            commands += "ldc \"]\"" + "\n";
            commands += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
            commands += "pop\n";
        }
        return commands;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        String commands = "";
        if(returnStmt.getReturnedExpr().accept(expressionTypeChecker) instanceof VoidType) commands += "return\n";
        else {
            commands += returnStmt.getReturnedExpr().accept(this);
            commands += "areturn\n";
        }
        return commands;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        String commands = "";
        Expression rOperand = binaryExpression.getSecondOperand();
        Expression lOperand = binaryExpression.getFirstOperand();
        BinaryOperator operator =  binaryExpression.getBinaryOperator();

        commands += lOperand.accept(this);
        if(operator.equals(BinaryOperator.mult)){
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += "imul\n";
            commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        else if(operator.equals(BinaryOperator.add)) {
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += "iadd\n";
            commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        else if(operator.equals(BinaryOperator.sub)) {
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += "isub\n";
            commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        else if(operator.equals(BinaryOperator.div)) {
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += "idiv\n";
            commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        else if(operator.equals(BinaryOperator.gt)) {
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            String label1 = generateFreshLabel();
            String label2 = generateFreshLabel();
            commands += "if_icmple "+label1+"\n";
            commands += "ldc 1\n";
            commands += "goto "+label2+"\n";
            commands += label1+":\n";
            commands += "ldc 0\n";
            commands += label2+":\n";
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else if(operator.equals(BinaryOperator.lt)) {
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            String label1 = generateFreshLabel();
            String label2 = generateFreshLabel();
            commands += "if_icmpge "+label1+"\n";
            commands += "ldc 1\n";
            commands += "goto "+label2+"\n";
            commands += label1+":\n";
            commands += "ldc 0\n";
            commands += label2+":\n";
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else if(operator.equals(BinaryOperator.and)) {
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            String label1 = generateFreshLabel();
            String label2 = generateFreshLabel();
            commands += "ifeq "+label1+"\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            commands += "ifeq "+label1+"\n";
            commands += "ldc 1\n";
            commands += "goto "+label2+"\n";
            commands += label1+":\n";
            commands += "ldc 0\n";
            commands += label2+":\n";
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else if(operator.equals(BinaryOperator.or)) {
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            String label1 = generateFreshLabel();
            String label2 = generateFreshLabel();
            commands += "ifne "+label1+"\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            commands += "ifne "+label1+"\n";
            commands += "ldc 0\n";
            commands += "goto "+label2+"\n";
            commands += label1+":\n";
            commands += "ldc 1\n";
            commands += label2+":\n";
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else if(operator.equals(BinaryOperator.eq)) {
            if (lOperand.accept(expressionTypeChecker) instanceof IntType) {
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += rOperand.accept(this);
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                String label1 = generateFreshLabel();
                String label2 = generateFreshLabel();
                commands += "if_icmpeq " + label1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + label2 + "\n";
                commands += label1 + ":\n";
                commands += "ldc 1\n";
                commands += label2 + ":\n";
            }
            else if(lOperand.accept(expressionTypeChecker) instanceof StringType ||
                    lOperand.accept(expressionTypeChecker) instanceof FptrType) {
                commands += rOperand.accept(this);
                String label1 = generateFreshLabel();
                String label2 = generateFreshLabel();
                commands += "if_acmpeq " + label1 + "\n";
                commands += "ldc 0\n";
                commands += "goto " + label2 + "\n";
                commands += label1 + ":\n";
                commands += "ldc 1\n";
                commands += label2 + ":\n";
            }
            else if(lOperand.accept(expressionTypeChecker) instanceof BoolType) {
                commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
                commands += rOperand.accept(this);
                commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
                String label1 = generateFreshLabel();
                String label2 = generateFreshLabel();
                commands += "if_icmpeq "+label1+"\n";
                commands += "ldc 0\n";
                commands += "goto "+label2+"\n";
                commands += label1+":\n";
                commands += "ldc 1\n";
                commands += label2+":\n";
            }
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else if(operator.equals(BinaryOperator.neq)) {
            if (lOperand.accept(expressionTypeChecker) instanceof IntType) {
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += rOperand.accept(this);
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                String label1 = generateFreshLabel();
                String label2 = generateFreshLabel();
                commands += "if_icmpeq "+label1+"\n";
                commands += "ldc 1\n";
                commands += "goto "+label2+"\n";
                commands += label1+":\n";
                commands += "ldc 0\n";
                commands += label2+":\n";
            }
            else if(lOperand.accept(expressionTypeChecker) instanceof StringType ||
                    lOperand.accept(expressionTypeChecker) instanceof FptrType) {
                commands += rOperand.accept(this);
                String label1 = generateFreshLabel();
                String label2 = generateFreshLabel();
                commands += "if_acmpeq "+label1+"\n";
                commands += "ldc 1\n";
                commands += "goto "+label2+"\n";
                commands += label1+":\n";
                commands += "ldc 0\n";
                commands += label2+":\n";
            }
            else if(lOperand.accept(expressionTypeChecker) instanceof BoolType) {
                commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
                commands += rOperand.accept(this);
                commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
                String label1 = generateFreshLabel();
                String label2 = generateFreshLabel();
                commands += "if_icmpeq "+label1+"\n";
                commands += "ldc 1\n";
                commands += "goto "+label2+"\n";
                commands += label1+":\n";
                commands += "ldc 0\n";
                commands += label2+":\n";
            }
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else if(operator.equals(BinaryOperator.append)){
            commands += "dup\n";
            commands += rOperand.accept(this);
            commands += "invokevirtual List/addElement(Ljava/lang/Object;)V\n";
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        Expression operand = unaryExpression.getOperand();
        UnaryOperator operator = unaryExpression.getOperator();
        String commands = "";
        commands += operand.accept(this);
        if(operator.equals(UnaryOperator.not)) {
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            String label1 = generateFreshLabel();
            String label2 = generateFreshLabel();
            commands += "ifeq "+label1+"\n";
            commands += "ldc 0\n";
            commands += "goto "+label2+"\n";
            commands += label1+":\n";
            commands += "ldc 1\n";
            commands += label2+":\n";
            commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        else if(operator.equals(UnaryOperator.minus)) {
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
            commands += "ineg\n";
            commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        return commands;
    }

    @Override
    public String visit(AnonymousFunction anonymousFunction) {
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + anonymousFunction.getName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }

    @Override
    public String visit(Identifier identifier) {
        String commands = "";
        Type type = identifier.accept(expressionTypeChecker);
        if(type instanceof FptrType) {
            String function_name = ((FptrType) type).getFunctionName();
            String function_key = "Function_" + function_name;
            try {
                SymbolTable.root.getItem(function_key);
                commands += "new Fptr\n";
                commands += "dup\n";
                commands += "aload_0\n";
                commands += "ldc " + "\"" + identifier.getName() + "\"\n";
                commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
            } catch (ItemNotFoundException ignored) {}
        }
        int slot = slotOf(identifier.getName());
        if(slot > 3)
            commands += "aload " + slot + "\n";
        else if (slot > -1)
            commands += "aload_" + slot + "\n";

        return commands;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex) {
        // me
        String commands = "";
        commands += listAccessByIndex.getInstance().accept(this);
        commands += listAccessByIndex.getIndex().accept(this);
        commands += "invokevirtual java/lang/Integer/intValue()I\n";
        commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        commands += "checkcast java/lang/Integer\n";
        return commands;
    }

    @Override
    public String visit(ListSize listSize) {
        String commands = "";
        commands += listSize.getInstance().accept(this);
        commands += "invokevirtual List/getSize()I\n";
        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        return commands;
    }

    @Override
    public String visit(FunctionCall funcCall) {
        String commands = "";

        commands += funcCall.getInstance().accept(this);
        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";

        int arraySlot = slotOf("");
        String array_load_command = "";
        if(arraySlot > 3) {
            commands += "astore " + arraySlot + "\n";
            array_load_command = "aload " + arraySlot + "\n";
        }
        else if(arraySlot > -1) {
            commands += "astore_" + arraySlot + "\n";
            array_load_command = "aload_" + arraySlot + "\n";
        }

        FptrType funcPtr = (FptrType) funcCall.getInstance().accept(expressionTypeChecker);
        String funcKey = "Function_" + funcPtr.getFunctionName();
        FunctionSymbolTableItem funcSTItem = null;
        try {
            funcSTItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(funcKey);
        } catch (ItemNotFoundException ignored) {}

        if(!funcCall.getArgs().isEmpty()) {
            ArrayList<Expression> args = funcCall.getArgs();
            for(Expression expression: args) {
                commands += array_load_command;             // load arrayList instance
                commands += expression.accept(this);  // load append value
                commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";  // append
                commands += "pop\n";
            }
        }
        else if(!funcCall.getArgsWithKey().isEmpty()) {
            Map<Identifier, Expression> args = funcCall.getArgsWithKey();
            ArrayList<String> arg_names = new ArrayList<>();
            ArrayList<Expression> arg_values = new ArrayList<>();
            ArrayList<Expression> sorted_arg_values = new ArrayList<>();
            for (Map.Entry<Identifier, Expression> argsWithKey: args.entrySet()) {
                arg_names.add(argsWithKey.getKey().getName());
                arg_values.add(argsWithKey.getValue());
            }

            assert funcSTItem != null;
            ArrayList<Identifier> func_args = funcSTItem.getFuncDeclaration().getArgs();

            for(Identifier argument: func_args) {
                int index = 0;
                while(!arg_names.get(index).equals(argument.getName()))
                    index += 1;

                sorted_arg_values.add(arg_values.get(index));
            }
//            System.out.println(sorted_arg_values);
            for(Expression value: sorted_arg_values) {
                commands += array_load_command;        // load arrayList instance
                commands += value.accept(this);  // load append value
                commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";  // append
                commands += "pop\n";
            }
        }
        commands += array_load_command;
        commands += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";

        assert funcSTItem != null;
        Type retType = funcSTItem.getReturnType();
        if(retType instanceof FptrType) {
            commands += "checkcast Fptr\n";
        }
        else if(retType instanceof ListType) {
            commands += "checkcast List\n";
        }
        else if(retType instanceof StringType) {
            commands += "checkcast java/lang/String\n";
        }
        else if(retType instanceof IntType) {
            commands += "checkcast java/lang/Integer\n";
        }
        else if(retType instanceof BoolType) {
            commands += "checkcast java/lang/Boolean\n";
        }

        return commands;
    }

    @Override
    public String visit(ListValue listValue) {
        String commands = "";
        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        int slot = slotOf("");
        String ldCmdGt3 = "aload " + slot + "\n";
        String ldCmdlt3 = "aload_" + slot + "\n";
        String strCmdGt3 = "astore " + slot + "\n";
        String strCmdlt3 = "astore_" + slot + "\n";
        if (slot > 3) commands += strCmdGt3;
        else commands += strCmdlt3;

        for (Expression element: listValue.getElements()){
            if (slot > 3) commands += ldCmdGt3;
            else commands += ldCmdlt3;
            commands += element.accept(this);
            commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            commands += "pop\n";
        }
        commands += "new List\n";
        commands += "dup\n";
        if (slot > 3) commands += ldCmdGt3;
        else commands += ldCmdlt3;
        commands += "invokespecial List/<init>(Ljava/util/ArrayList;)V\n";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        return "ldc " + intValue.getConstant() + "\n" + "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
    }

    @Override
    public String visit(BoolValue boolValue) {
        int val;
        if (boolValue.getConstant())
            val = 1;
        else
            val = 0;
        return "ldc " + val + "\n" + "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
    }

    @Override
    public String visit(StringValue stringValue) {
        return "ldc " + "\"" + stringValue.getConstant() + "\"" + "\n";
    }

    @Override
    public String visit(VoidValue voidValue) {
        return null;
    }
}
