package Structural.design.adapter.Composite;

import java.util.Comparator;

/**
 * Created by admins on 7/30/17.
 */
public class Test {


    public static void main(String[] args) {
        Composite composite=new Composite();

        composite.populateList(new Daigram[]{new Circle(),new Square(),new Triangle()});

        composite.cloneObject();
    }

}
