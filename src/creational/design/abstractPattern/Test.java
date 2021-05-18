package creational.design.abstractPattern;

/**
 * Created by admins on 7/30/17.
 */
public class Test {

    public static void main(String[] args) {
        Employee mentor=EmployeeFactory.getEmployee(new MentorFactory("mentor1",25));
        System.out.println(mentor.getName());
    }

}
