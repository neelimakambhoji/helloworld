package collectionassigns;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpMain {
    public static void main (String[]arg){
        ArrayList<Emp>objs = new ArrayList<Emp>();
        objs.add(new Emp(234,"Advaith"));
        objs.add(new Emp(543,"Akshu"));
        // ForEach loop() print the data
        for(Emp e : objs) {
            System.out.println(e.eid + " " + e.ename);
        }
        System.out.println("*****************************************");
        //  get() method to print the data
         Emp ee = objs.get(1);
         System.out.println(ee.eid+" "+ee.ename);
         System.out.println("*****************************************");
         // Read the Data using Iterator <generic>
        Iterator<Emp> gitr = objs.iterator();
        while(gitr.hasNext()){
            Emp e =gitr.next();
            System.out.println(e.eid +" "+ e.ename);
        }
        System.out.println("********************************************");
        //Read the data using forEach()Method : using Lambda
        objs.forEach(emp ->System.out.println(ee.eid +" "+ ee.ename));
    }
}
