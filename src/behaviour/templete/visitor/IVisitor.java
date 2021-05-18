package behaviour.templete.visitor;

/**
 * Created by admins on 8/18/17.
 */
interface IVisitor {
    public int visitFruit(Fruit fruit);
    public int visitGroceries(Groceries groceries);
    public int visitGames(Games games);
}
