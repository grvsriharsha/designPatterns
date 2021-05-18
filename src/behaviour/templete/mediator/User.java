package behaviour.templete.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admins on 8/4/17.
 */
public class User implements UserI {

    MediatorI mediatorI;
    String name;

    List<User> friends;
    List<User> group;
    User(MediatorI mediatorI, String name)
    {
        this.mediatorI=mediatorI;
        this.name=name;
        friends=new ArrayList<>();
        group=new ArrayList<>();
    }

    @Override
    public void sendMessages(List<String> people,String message) {

        mediatorI.distirbuteMessages(group,message);
    }

    @Override
    public void receiveMessage(String message) {

    }

    @Override
    public void addFriends(User user) {
        friends.add(user);
    }

    @Override
    public void addGroup(User user) {
        if(!friends.contains(user)) {
            friends.add(user);
        }

        group.add(user);
    }


}
