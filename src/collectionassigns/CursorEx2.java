package collectionassigns;

import java.util.*;

public class CursorEx2 {
    public static void main(String[]arg){
        ArrayList<String>objs = new ArrayList<String>();
        objs.add("Harry potter");
        objs.add("East of Eden");
        objs.add("pride");
        objs.add("House of Mirth");
        // Read the data using for Each loop ()
        for(String s : objs) {
            System.out.println(s);
        }
        System.out.println("**********************************");
        // Read the data using get() method
        String name = objs.get(3);
        System.out.println(name);
        System.out.println("**********************************");
        // Read the data using ListIterator<generic>
        ListIterator<String> slitr = objs.listIterator();
        while(slitr.hasNext()){
            String s = slitr.next();
            System.out.println(s);
        }
        System.out.println("***********************************");
        //Read the data using forEach()method
        objs.forEach(str->System.out.println(str));
    }
}
