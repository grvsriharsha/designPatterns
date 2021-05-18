package creational.design.builder;

/**
 * Created by admins on 7/30/17.
 */
public class Test {
    public static void main(String[] args) {
        Person person=new Person.PersonBuilder("Sriharsha","RamaVenakata").setAge(9).setId(226).build();

    }
}
