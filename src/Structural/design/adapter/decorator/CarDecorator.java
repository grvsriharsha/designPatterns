package Structural.design.adapter.decorator;

/**
 * Created by admins on 8/3/17.
 */
public class CarDecorator implements CarInterface {
    CarInterface carInterface;
    CarDecorator(CarInterface carInterface)
    {
        this.carInterface=carInterface;
    }
    @Override
    public void assemble() {
        carInterface.assemble();
    }
}
