package creational.design.abstractPattern;

/**
 * Created by admins on 7/30/17.
 */
public class Fresher extends Employee {


    public Fresher(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
