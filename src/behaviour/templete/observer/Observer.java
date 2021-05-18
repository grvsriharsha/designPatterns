package behaviour.templete.observer;

/**
 * Created by admins on 8/5/17.
 */
public class Observer implements IObserver {
    @Override
    public void receiveUpdate(String message) {

    }

    Observer(String name,ISubject subject)
    {
        this.name=name;
        this.subject=subject;
    }


    String name;
    ISubject subject;
}
