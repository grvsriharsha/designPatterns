package Structural.design.adapter.flyweight;

import java.util.HashMap;

/**
 * Created by admins on 7/31/17.
 */
public class flyFactory {

    public static HashMap<String,ShapeI> hashMap=new HashMap<>();
    public static ShapeI getInstance(String name)
    {
        if("Rectangle".equalsIgnoreCase(name))
        {
            if(hashMap.get(name)==null)
                hashMap.put(name,new Rectangle(1,2,"3"));
        }
        return hashMap.get(name);
    }
}
