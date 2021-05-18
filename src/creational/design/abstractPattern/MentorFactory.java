package creational.design.abstractPattern;

/**
 * Created by admins on 7/30/17.
 */
public class MentorFactory implements EmployeeAbstarctFactory {
    String name;
    int age;
    public MentorFactory(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public Employee getEmployee() {
        return new Mentor(name,age);
    }
}
