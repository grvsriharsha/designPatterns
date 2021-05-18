package behaviour.templete.observer;

/**
 * Created by admins on 8/5/17.
 */
public interface ISubject {

    public void notifyObservers(String message);

    public void deleteObserver(Observer name);
    public void addObserver(Observer name);
    public void setUpdeFromInput(String message);


}
