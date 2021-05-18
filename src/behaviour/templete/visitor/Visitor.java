package behaviour.templete.visitor;

/**
 * Created by admins on 8/18/17.
 */
public class Visitor implements IVisitor {

    @Override
    public int visitFruit(Fruit fruit) {
        return fruit.getCost(); //someshit
    }

    @Override
    public int visitGroceries(Groceries groceries) {
         return groceries.getCost();
    }

    @Override
    public int visitGames(Games games) {
        return games.getCost();
    }
}
