package collectionassigns;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorEx6 {
    public static void main(String[]args){
        // forward,backward
        ArrayList<String>objects = new ArrayList<String>();
        objects.add("neelu");
        objects.add("akshu");
        objects.add("cheeku");
        ListIterator<String> lstr = objects.listIterator();
        while(lstr.hasNext()) {
            String s = lstr.next();
            System.out.println(s);
        }
            System.out.println("****************************");

            while(lstr.hasPrevious()){
                String str = lstr.previous();
                System.out.println(str);
            }
        }
    }

