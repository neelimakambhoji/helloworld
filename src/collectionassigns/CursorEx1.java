package collectionassigns;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorEx1 {
    public static void main(String[]args){
        ArrayList<String>objs = new ArrayList<String>();
        objs.add("neelu");
        objs.add("Akshu");
        objs.add("Ratna");
        objs.add("Rani");
        //read the data using for-each loop
        for(String s : objs){
            System.out.println(s);
        }
        System.out.println("*******************************");

        //Read the data using get() method
        String name = objs.get(2);
        System.out.println(name);
        System.out.println("*******************************");

        //read the data using normal cursor : Iterator
        Iterator itr = objs.iterator();
        while (itr.hasNext()){
            String s =(String)itr.next();
            System.out.println(s);
        }
        System.out.println("*******************************");

        //read the data using generic cursor : Iterator
        Iterator <String> sitr =objs.iterator();
        while (sitr.hasNext()) {
            String s = sitr.next();
            System.out.println(s);
        }
            System.out.println("*******************************");
        // Reading the data using forEach() method : using Lambda    : java 8
        objs.forEach(str->System.out.println(str));
    }
         // Reading the data using forEach() method : using method Interface   : java 8
          //  objs.forEach(System.out::println);
}
