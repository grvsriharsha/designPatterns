package creational.design.prototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admins on 7/30/17.
 */
public class Employees  {

    List<String> employeelist;
    public Employees(List<String> employeelist)
    {
        this.employeelist=employeelist;
    }


    public Employees clone() {
        List<String> temp = new ArrayList<String>();
        for(String s : employeelist){
            temp.add(s);
        }

        return new Employees(temp);
    }
}
