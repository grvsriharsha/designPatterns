package behaviour.templete.chainResponsibility;

/**
 * Created by admins on 8/4/17.
 */
public class Dispenser50 extends Idispense {


    @Override
    public void dispesnse(int amount) {
     if(amount <50)
     {
         nextDispence.dispesnse(amount);
         return;
     }
        int num=amount/50;
        int balance=amount%50;

        if(balance !=0)
            dispesnse(amount);

    }

Dispenser50(Idispense idispense)
{
   nextDispence=idispense;
}

}
