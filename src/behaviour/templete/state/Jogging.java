package behaviour.templete.state;

/**
 * Created by admins on 8/18/17.
 */
public class Jogging implements IState {
    private Person person;

    public Jogging(Person Person)
    {
        this.person=person;

    }
    @Override
    public void doAction() {

    }
}
