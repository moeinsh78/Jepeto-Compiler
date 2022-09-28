package main.ast.nodes.declaration;


import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;


//MAIN
public class MainDeclaration extends Declaration{

    protected Statement body;
    protected int next_temp_index = 0;

    public int get_next_temp_index() {
        this.next_temp_index++;
        return this.next_temp_index;
    }


    public Statement getBody() {
        return body;
    }

    public void setBody(Statement body) {
        this.body = body;
    }






    @Override
    public String toString() {
        return "MainDeclaration";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
