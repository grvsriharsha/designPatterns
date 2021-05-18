package practise;

import java.util.List;

/**
 * Created by admins on 8/5/17.
 */
public class Paytm extends APayment {



    Paytm(String userName,String password) throws AuthenticationException {
        checkAuthentication(userName,password);
    }

    @Override
    protected void makePayment(int amount) {

    }

    @Override
    protected void checkAuthentication(String userName, String password) throws AuthenticationException {
        //chek auth
    }

    @Override
    public void itemsAvailable(List<String> list) {

    }


}
