package behaviour.templete.command;

/**
 * Created by admins on 8/5/17.
 */
public class Stock {

    String name;
    int cost;
    Stock(String name,int cost)
    {
        this.name=name;
        this.cost=cost;
    }

   public String toString()
   {
       return "Stock "+name+" sold for "+cost;
   }
}
