package behaviour.templete.state;

/**
 * Created by admins on 8/18/17.
 */
public class StateContext implements IState {  //have a similar state implrmntation and make the actioms from here

    private IState state;

    public void setState(IState state)
    {
        this.state=state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
