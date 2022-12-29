package collectionassigns;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx1 {
    public static void main (String[]args){
        // constructor :1
        Vector<String>objects = new Vector<String>();
        objects.add("neelu");
        objects.add("akshu");
        objects.add("cheeku");
        System.out.println(objects.capacity());
        System.out.println("********");

         //constructor : 2 intialCapacity
        Vector<String>objs = new Vector<String>(3);
        System.out.println(objs.capacity());//3
        objs.add("neelu");
        objs.add("akshu");
        objs.add("cheeku");
        objs.add("vijay");
        System.out.println(objs.capacity());//6
        System.out.println("************");

        // constructor: 3 initialCapacityIncrement
        Vector<String> data = new Vector<String>(2,6);
        System.out.println(data.capacity());
        data.add("neelu");
        data.add("akshu");
        data.add("cheeku");
        System.out.println(data.capacity());
        System.out.println("*********************");

        //adding 1 collection to another collection
        ArrayList<String>al = new ArrayList<String>();
        al.add("anu");
        Vector<String>v = new Vector<String>(al);
        v.add("ratan");
        System.out.println(v);
    }
}
