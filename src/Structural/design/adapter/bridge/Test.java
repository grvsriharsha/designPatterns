package Structural.design.adapter.bridge;

/**
 * Created by admins on 8/2/17.
 */
public class Test {
    public static void main(String[] args) {

        BridgeAC bridge=new BridgeImpl(new CircleImpl());
        bridge.draw();
    }
}
