package Structural.design.adapter.proxy;

/**
 * Created by admins on 7/30/17.
 */
public class CommanProxy implements CommandI {

    CommandI commandI;
    public CommanProxy(String user,String passwd)
    {
        if("a".equalsIgnoreCase(user)&& "p".equalsIgnoreCase(passwd))
            commandI=new CommandExecutor();
    }

    @Override
    public void runComand(String command) {

        if(commandI==null)
        {
            System.out.println("u hav wrng credntls");
            return;
        }
        if(command==null)
        {
            System.out.println("worng command");
            return;
        }

        if(!command.contains("rm"))
        {
            //some shit
        }

    }

}
