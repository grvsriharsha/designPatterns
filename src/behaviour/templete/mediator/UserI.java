package behaviour.templete.mediator;

import java.util.List;

/**
 * Created by admins on 8/4/17.
 */
interface UserI {

    public void sendMessages(List<String> people, String message);

    public void receiveMessage(String message);

    public void addFriends(User user);

    public void addGroup(User user);
}
