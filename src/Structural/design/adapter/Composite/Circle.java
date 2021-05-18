package Structural.design.adapter.Composite;

/**
 * Created by admins on 7/30/17.
 */
public class Circle implements Daigram {


    @Override
    public Circle cloneObject() {
        return new Circle();
    }
}
