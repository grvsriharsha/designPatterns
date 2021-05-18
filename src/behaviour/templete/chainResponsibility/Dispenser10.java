package behaviour.templete.chainResponsibility;

/**
 * Created by admins on 8/4/17.
 */
public class Dispenser10 extends Idispense
{


    @Override
    public void dispesnse(int amount) {
       //process
    }



    Dispenser10(Idispense idispense)
    {
        nextDispence=idispense;
    }
}
