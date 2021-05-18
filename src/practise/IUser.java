package practise;

import behaviour.templete.mediator.User;

import java.util.List;

/**
 * Created by admins on 8/5/17.
 */
public interface IUser {
public void buyItems(List<String> list);

public void addItems(String item);
public void login(String username,String password) throws AuthenticationException;

}
