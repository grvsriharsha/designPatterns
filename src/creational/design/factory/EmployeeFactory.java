package creational.design.factory;

/**
 * Created by admins on 7/30/17.
 */
public class EmployeeFactory {
    public static Employee getEmployee(String name)
    {
        if("Mentor".equalsIgnoreCase(name))
            return new Mentor("mentor1",25);
        else
            return new Fresher("fresher1",20);
    }
}
