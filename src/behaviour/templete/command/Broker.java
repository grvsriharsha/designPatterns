package behaviour.templete.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admins on 8/5/17.
 */
public class Broker implements IBroker {
List<Stock> buystocks=new ArrayList<>();
List<Stock> sellStocks=new ArrayList<>();
ICommand sellcommand =new SEllCommand();
ICommand buycommand =new BuyCommand();


    @Override
    public void addStocktoBuy(Stock stock) {
        buystocks.add(stock);

    }


    @Override
    public void sellStocktoBuy(Stock stock) {
        sellStocks.add(stock);

    }

    @Override
    public void buyStocks() {
        buycommand.execute(buystocks);
    }

    @Override
    public void sellStocks() {
        sellcommand.execute(sellStocks);
    }
}
