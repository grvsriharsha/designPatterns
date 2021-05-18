package behaviour.templete.visitor;

/**
 * Created by admins on 8/18/17.
 */
public class Fruit implements IItemI {
    @Override
    public int getCost() {
        return 020;
    }

    @Override
    public boolean allowVisiter(IVisitor visitor) {
        return false;
    }
}
