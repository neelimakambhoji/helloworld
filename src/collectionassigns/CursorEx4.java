package collectionassigns;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorEx4 {
    public static void main(String[]args){
        ArrayList<String>objects = new ArrayList<String>();
        objects.add("Neelu");
        objects.add("Akshu");
        objects.add("Ratna");
        Iterator<String>itr = objects.iterator();
        while(itr.hasNext()){                     //using iterator remove the data
            String s = itr.next();
            if(s.equals("Ratna"))
                itr.remove();
            }
            System.out.println(objects);

    }

}
