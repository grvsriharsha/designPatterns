package Structural.design.adapter.bridge;



/**
 * Created by admins on 8/2/17.
 */
public class BridgeImpl  extends BridgeAC  {
    BridgeImpl(ImplInterface implInterface) {
        super(implInterface);
    }

    @Override
    public void draw() {

        implInterface.fill();
    }
}
