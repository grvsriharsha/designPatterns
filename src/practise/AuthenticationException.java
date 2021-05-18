package practise;

/**
 * Created by admins on 8/5/17.
 */
public class AuthenticationException extends Exception {

    AuthenticationException(String message)
    {
        super(message);
    }
    AuthenticationException(String message,Exception ex)
    {
        super(message,ex);
    }
}
