package behaviour.templete.memonto;

/**
 * Created by admins on 8/18/17.
 */
public class Test {


    //say u want save moments when the value ogf integer is odd in Orginator

    public static void main(String[] args) {

        IcareTaker icareTaker=new CareTaker();


        Orgintor originator=new Orgintor(1234);

  for (int i=0;i<10;i++)
  {
      originator=new Orgintor(i);
      if(i%2==0)
      {
          icareTaker.saveState(originator);
      }
  }


        for (int i=10;i>=1;i=i/3)
        {
            icareTaker.undoSaveState(originator);

            System.out.println("Current state :"+originator.getContent());
        }
    }
}
