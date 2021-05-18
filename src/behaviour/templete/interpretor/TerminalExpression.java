package behaviour.templete.interpretor;

/**
 * Created by admins on 8/19/17.
 */
public class TerminalExpression implements IExpression {
    TerminalExpression(String line)
    {
        this.line=line;
    }
    String line;



    public boolean evaluate(String inputexpression) {

        if(line!=null)
        {
            String[]phrases=line.split(" ");
       // ifphrases consist of substring
            return true;
        }
        return false;
    }
}
