package behaviour.templete.mediator;

import java.util.List;

/**
 * Created by admins on 8/4/17.
 */
public class Mediator implements MediatorI {
    @Override
    public void distirbuteMessages(List<User> people, String message) {

        for (User person:people)
        {
            person.receiveMessage(message);
        }
    }


}
