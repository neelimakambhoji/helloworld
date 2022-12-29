package collectionsorting;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {
    public static void main(String[]args){
        ArrayList<Emp>al=new ArrayList<Emp>();
        al.add(new Emp(111,"neeli"));
        al.add(new Emp(444,"Akshu"));
        al.add(new Emp(333,"cheeku"));
        al.add(new Emp(222,"advaith"));
        Collections.sort(al);
        for( Emp e  :al){
            System.out.println(e.eid+" "+e.ename);
        }
    }
}
