package behaviour.templete.interpretor;

/**
 * Created by admins on 8/19/17.
 */
public class Test {
    public static void main(String[] args) {
        TerminalExpression terminalExpression1=new TerminalExpression("Name1");
        TerminalExpression terminalExpression2=new TerminalExpression("Name2");

        ORExpression orExpression=new ORExpression(terminalExpression1,terminalExpression2);

        orExpression.evaluate("evalute the substring match");
    }
}
