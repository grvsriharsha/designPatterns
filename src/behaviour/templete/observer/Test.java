package behaviour.templete.observer;

/**
 * Created by admins on 8/5/17.
 */
public class Test {
    public static void main(String[] args) {
        ISubject subject=new Subject("Temperature");

        for (int i=0;i<10;i++)
        {
            Observer observer=new Observer("observer"+i,subject);
            subject.addObserver(observer);
        }

        subject.setUpdeFromInput("34");

    }
}
