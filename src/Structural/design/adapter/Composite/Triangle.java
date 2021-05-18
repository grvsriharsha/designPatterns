package Structural.design.adapter.Composite;

/**
 * Created by admins on 7/30/17.
 */
public class Triangle implements Daigram {
    @Override
    public Triangle cloneObject() {
        return new Triangle();
    }
}
