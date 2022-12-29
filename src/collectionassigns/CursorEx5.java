package collectionassigns;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorEx5 {
    public static void main(String[]args){
        //add the data ,remove,replace
        ArrayList<String>objects = new ArrayList<String>();
        objects.add(" Raju");
        objects.add("Ravi");
        objects.add("Anu");
        ListIterator<String> lstr = objects.listIterator();
        lstr.add("Ram");
        while (lstr.hasNext()){
            String s = lstr.next();
            if(s.equals("Ravi"))
               lstr.remove();
            if(s.equals("Anu"))
                lstr.set("Anushka");
        }
        System.out.println(objects);
    }
}
