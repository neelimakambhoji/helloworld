package collectionsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class SortingEx1 {
    public static void main(String[]args){
        //case :1
        ArrayList<String>a1 = new ArrayList<>();
        a1.add("neelu");
        a1.add("akshu");
        a1.add("cheeku");
        a1.add("anu");
        System.out.println("before sorting:"+a1);
        Collections.sort(a1);
        System.out.println("after sorting:" + a1);

        LinkedList<Integer>l = new LinkedList<Integer>();
        l.add(10);
        l.add(5);
        l.add(75);
        l.add(14);
        System.out.println("Before sorting :" + l);
        Collections.sort(l);
        System.out.println("After sorting :" +l);

        //case:2  CCE
        ArrayList a2 = new ArrayList();
        a2.add(10);
        a2.add("neelu");
      //  Collections.sort(a2);   java.lang.ClassCastException

        //case :3  NullPoint Exception
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(null);
       // Collections.sort(v);   java.lang.NullPointerException
    }
}
