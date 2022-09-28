package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statement.Statement;
import main.ast.types.functionPointer.FptrType;
import main.visitor.IVisitor;
import java.util.*;

//line -> FUNC
public class FunctionDeclaration extends Declaration {
    protected Identifier functionName;
    protected ArrayList<Identifier> args = new ArrayList<>();
    protected Statement body;

    private boolean isCalledBefore = false;
    private boolean isVisited = false;

    public boolean getCalledBefore() {
        return this.isCalledBefore;
    }

    public void setCalledBefore() {
        this.isCalledBefore = true;
    }

    public void resetCalledBefore() {
        this.isCalledBefore = false;
    }

    public void setVisited() {
        this.isVisited = true;
    }

    public void resetVisited() {
        this.isVisited = false;
    }

    public boolean getVisited() {
        return this.isVisited;
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
