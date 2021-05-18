package behaviour.templete.command;

/**
 * Created by admins on 8/5/17.
 */
public class Test {
    public static void main(String[] args) {
    IBroker broker=new Broker();
        broker.addStocktoBuy(new Stock("a",1));
        broker.addStocktoBuy(new Stock("b",1));

        broker.buyStocks();

    }
}
