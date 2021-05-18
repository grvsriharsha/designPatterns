package creational.design.SingleTon;

/**
 * Created by admins on 7/29/17.
 */
public class Singlrton {
    private Singlrton(){}
    private static Singlrton instance;
    public static Singlrton getInstance()
    {
        if(instance==null)
        {
            synchronized (Singlrton.class)
            {
                instance=new Singlrton();
            }
        }        return instance;
    }


    private static class SingletonHelper{
        private static final Singlrton INSTANCE = new Singlrton();
    }

    public void print()
    {
        System.out.println("Hello");
    }

    public static Singlrton getInstancePhilHug()
    {
        return SingletonHelper.INSTANCE;
    }
}
