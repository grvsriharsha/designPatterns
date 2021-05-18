package behaviour.templete.visitor;

import java.util.HashMap;

/**
 * Created by admins on 8/18/17.
 */
public class Test {

    public static void main(String[] args) {
        Visitor visitor=new Visitor();
        HashMap<String,IItemI> hashMap=new HashMap<>();
        hashMap.put("fruit",new Fruit());
        hashMap.put("groceries",new Groceries());
        hashMap.put("games",new Games());

        visitor.visitFruit((Fruit)hashMap.get("fruit"));

    }
}
