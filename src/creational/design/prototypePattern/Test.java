package creational.design.prototypePattern;

import java.util.ArrayList;

/**
 * Created by admins on 7/13/17.
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("sssss");
        Employees employees=new Employees(arrayList);
        Employees clonedList=employees.clone();
        for (String name:clonedList.employeelist)
        {
            System.out.println(name);
        }
    }


}
