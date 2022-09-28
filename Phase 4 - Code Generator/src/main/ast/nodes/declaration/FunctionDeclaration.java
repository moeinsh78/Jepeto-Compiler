package main.ast.nodes.declaration;


import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statement.Statement;

import main.visitor.IVisitor;

import java.util.ArrayList;

//line -> FUNC
public class FunctionDeclaration extends Declaration {
    protected Identifier functionName;
    protected ArrayList<Identifier> args = new ArrayList<>();
    protected Statement body;
    protected int next_temp_index = 0;

    public int get_next_temp_index() {
        this.next_temp_index++;
        return this.next_temp_index;
    }

    public Identifier getFunctionName() {
        return functionName;
    }

    public void setFunctionName(Identifier methodName) {
        this.functionName = methodName;
    }

    public ArrayList<Identifier> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<Identifier> args) {
        this.args = args;
    }

    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }

    public void addArg(Identifier argument) {
        this.args.add(argument);
    }





    @Override
    public String toString() {
        return "FunctionDeclaration_" + this.functionName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
