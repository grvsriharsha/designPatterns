package Structural.design.adapter.flyweight;

/**
 * Created by admins on 8/1/17.
 */
public class Test {

    public static void main(String[] args) {
        ShapeI shapeI=flyFactory.getInstance("Rectangle");
         shapeI.draw();  //can use such functions many times with same object
    }
}
