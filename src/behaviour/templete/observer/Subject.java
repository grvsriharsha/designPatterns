package behaviour.templete.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admins on 8/5/17.
 */
public class Subject implements ISubject {

    List<Observer> list=new ArrayList<>();
    String subjectName;

    Subject(String subjectName)
    {
        this.subjectName=subjectName;
    }
    public void setUpdeFromInput(String message)
    {
        notifyObservers(message);
    }
    @Override
    public void notifyObservers(String message) {

        for (Observer observer:list)
        {
            observer.receiveUpdate(message);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {

        list.remove(observer);
    }

    @Override
    public void addObserver(Observer observer) {
          list.add(observer);
    }


}
