package creational.design.abstractPattern;

/**
 * Created by admins on 7/30/17.
 */
public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstarctFactory employeeAbstarctFactory)
    {
        return employeeAbstarctFactory.getEmployee();
    }
}
