package Structural.design.adapter.Composite;

import java.util.Date;

/**
 * Created by admins on 7/30/17.
 */
public class Square implements Daigram {
    @Override
    public Square cloneObject() {
       return new Square();
    }
}
