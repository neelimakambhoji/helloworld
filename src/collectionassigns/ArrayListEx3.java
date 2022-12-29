package collectionassigns;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[]args){
        //Constructor approach = Adding one Collection into another collection : one to one
        ArrayList<String>a1 = new ArrayList<String>();
        a1.add(" neelu");
        a1.add("ratan");
        ArrayList<String>a2 = new ArrayList<String>(a1);
        a2.add("raju");
        a2.add("ravi");
         System.out.println(a2);

         //addAll() Approach : Adding many collections into another collection : many to one
        ArrayList<Integer>objs1 = new ArrayList<Integer>();
        objs1.add(10);
        objs1.add(20);
        ArrayList<Integer>objs2 = new ArrayList<Integer>();
        objs2.add(100);
        objs2.add(200);
        ArrayList<Integer>objs3 = new ArrayList<Integer>();
        objs3.addAll(objs1);
        objs3.addAll(objs2);
        objs3.add(1000);
        System.out.println(objs3);
    }
}
