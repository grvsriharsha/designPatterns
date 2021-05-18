package creational.design.abstractPattern;

/**
 * Created by admins on 7/30/17.
 */
public class Mentor extends Employee {

    public Mentor(String name,int age)
    {
        this.age=age;
        this.name=name;
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
