package behaviour.templete.visitor;

/**
 * Created by admins on 8/18/17.
 */
public class Games implements IItemI {
    @Override
    public int getCost() {

return 100;
    }

    @Override
    public boolean allowVisiter(IVisitor visitor) {
        return false;
    }
}
