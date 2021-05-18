package behaviour.templete.state;

/**
 * Created by admins on 8/18/17.
 */
public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        StateContext stateContext=new StateContext();
        stateContext.setState(new Running(person));

        person.performState(stateContext);
    }
}
