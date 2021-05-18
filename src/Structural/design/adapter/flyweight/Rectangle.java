package Structural.design.adapter.flyweight;

/**
 * Created by admins on 7/31/17.
 */
public class Rectangle implements ShapeI {
    int length;
    int breadth;
    String color;
    public Rectangle(int length,int breadth,String color)
    {
        this.length=length;
        this.breadth=breadth;
        this.color=color;
    }

    @Override
    public void draw() {
        //
    }



}
