package practise;

/**
 * Created by admins on 8/5/17.
 */
public class PaymentFactory {
    public static APayment getInstance(String paymentMode,String username,String password) throws AuthenticationException {
        if("Paytm".equalsIgnoreCase(paymentMode))
            return new Paytm(username,password);
        else
            return new MobiQuick(username,password);
    }
}
