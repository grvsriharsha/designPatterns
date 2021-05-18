package behaviour.templete.chainResponsibility;

/**
 * Created by admins on 8/4/17.
 */
public class Test {


    public static void main(String[] args) {
        Idispense idispense=new Dispenser50(new Dispenser10(null));
        idispense.dispesnse(100);
    }
}
