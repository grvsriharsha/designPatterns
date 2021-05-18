package Structural.design.adapter.bridge;

/**
 * Created by admins on 8/2/17.
 */
public abstract class BridgeAC {
   protected ImplInterface implInterface;
    BridgeAC(ImplInterface implInterface)
    {
        this.implInterface=implInterface;
    }

    public abstract void draw();

}
