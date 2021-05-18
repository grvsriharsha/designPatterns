package behaviour.templete.templete;

/**
 * Created by admins on 8/3/17.
 */
public abstract class HouseTemplete {

    public final void build()
    {
        foundation();
        layout();
        buildWAllls();
        buildWindows();
    }


    public final void foundation()
    {
       //foundaton is commn for everything
    }

    public abstract void layout();

    public abstract void buildWAllls();

    public abstract void buildWindows();

}
