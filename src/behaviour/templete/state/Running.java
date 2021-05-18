package behaviour.templete.state;

/**
 * Created by admins on 8/18/17.
 */
public class Running implements IState {

    private Person person;

    public Running(Person Person)
    {
        this.person=person;

    }
    @Override
    public void doAction() {
//
    }
}
