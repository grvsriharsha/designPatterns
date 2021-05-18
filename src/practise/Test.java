package practise;

/**
 * Created by admins on 8/5/17.
 */
public class Test {
    public static void main(String[] args){
        try {
            APayment paymentMode=PaymentFactory.getInstance("paytm","a","b");
        } catch (AuthenticationException e) {
             e.printStackTrace();

        }
    }
}
