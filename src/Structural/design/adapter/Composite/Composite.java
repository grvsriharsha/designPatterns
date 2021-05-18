package Structural.design.adapter.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admins on 7/30/17.
 */
public class Composite implements Daigram {


    private List<Daigram> list=new ArrayList<>();


    public void populateList(Daigram[] objects)
    {
        for(Daigram daigram:objects)
            list.add(daigram);
    }


    public void clear()
    {
        list.clear();
    }

    @Override
    public Object cloneObject() {
        for (Daigram daigram:list)

        {
            daigram.cloneObject();
        }
        return this;
    }
}
