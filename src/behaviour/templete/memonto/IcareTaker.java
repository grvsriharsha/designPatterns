package behaviour.templete.memonto;

import java.util.ArrayList;

/**
 * Created by admins on 8/18/17.
 */
public interface IcareTaker { //both have void return types and no accss to MEmonto


    public void saveState(Orgintor originator);

    public void undoSaveState(Orgintor originator);

     ArrayList arrylist=new ArrayList();
}
