package practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admins on 8/5/17.
 */
public class User implements IUser {
    APayment paymentMode;
    User(APayment paymentMode,String username,String password) throws AuthenticationException {
        this.paymentMode=paymentMode;
        login(username,password);

    }

    List<String> list=new ArrayList<>();

    @Override
    public void buyItems(List<String> list) {

    }

    @Override
    public void addItems(String item) {

    }

    @Override
    public void login(String username, String password) throws AuthenticationException {
        paymentMode.checkAuthentication(username,password);
    }
}
