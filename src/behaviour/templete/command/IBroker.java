package behaviour.templete.command;

/**
 * Created by admins on 8/5/17.
 */
interface IBroker {


    public void addStocktoBuy(Stock stock);
    public void sellStocktoBuy(Stock stock);
    public void buyStocks();
    public void sellStocks();
}
