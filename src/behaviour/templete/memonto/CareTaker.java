package behaviour.templete.memonto;

/**
 * Created by admins on 8/18/17.
 */
public class CareTaker implements IcareTaker {

   // private Object currentState;//consist of MEMONTO,but cannot access ;it

    @Override
    public void saveState(Orgintor originator) {

      arrylist.add(originator.save());
    }

    @Override
    public void undoSaveState(Orgintor originator) {
       Object object=arrylist.remove(arrylist.size()-1);
        originator.undoSave(object);
    }
}
