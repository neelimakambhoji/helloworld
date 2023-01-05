package collectionMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Test7 {
    //TreeMap(Comparator c)
    public static void main(String[] args) {
        TreeMap<Integer, String> t1 = new TreeMap<Integer, String>(new MyComp());
        t1.put(1, "neelu");
        t1.put(10, "cheeku");
        t1.put(7, "akshu");
        t1.put(5, "ratana");
        t1.put(20, "cheeku");
        System.out.println(t1);
    }
}
   class MyComp implements Comparator<Integer> {


       @Override
       public int compare(Integer i1, Integer i2) {
           return -i1.compareTo(i2);
       }
   }




