package practise;

import java.util.List;

/**
 * Created by admins on 8/5/17.
 */
public abstract class APayment {



protected abstract void makePayment(int amount);


protected abstract void checkAuthentication(String userName,String password) throws AuthenticationException;

    public abstract void itemsAvailable(List<String> list);


}
