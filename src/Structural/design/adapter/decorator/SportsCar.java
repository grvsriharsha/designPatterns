package Structural.design.adapter.decorator;

/**
 * Created by admins on 8/3/17.
 */
public class SportsCar extends CarDecorator {
    SportsCar(CarInterface carInterface) {
        super(carInterface);
    }

    public void assemble()
    {
        super.assemble();

        ///add sports data
    }
}
