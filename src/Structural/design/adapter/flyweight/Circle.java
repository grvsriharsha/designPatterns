package Structural.design.adapter.flyweight;

/**
 * Created by admins on 7/31/17.
 */
public class Circle implements ShapeI {

    String color;
    //You dnt want to use thse objects again.
    public Circle(String color)
    {
        this.color=color;
    }
    @Override
    public void draw() {
        //fill with color
    }
}
