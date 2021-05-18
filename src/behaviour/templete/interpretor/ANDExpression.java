package behaviour.templete.interpretor;

/**
 * Created by admins on 8/19/17.
 */
public class ANDExpression  {

    public boolean evaluate(String inputexpression) {
     return terminalExpression1.evaluate(inputexpression) && terminalExpression2.evaluate(inputexpression);
    }

    ANDExpression(TerminalExpression terminalExpression1,TerminalExpression terminalExpression2)
    {
       this.terminalExpression1=terminalExpression1;
        this.terminalExpression2=terminalExpression2;
    }
  TerminalExpression terminalExpression1;
    TerminalExpression terminalExpression2;


}
