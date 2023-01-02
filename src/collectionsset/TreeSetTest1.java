package collectionsset;

import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[]args){
        TreeSet<String> t = new TreeSet<String>();
        t.add("neelu");
        t.add("akshu");
        t.add("cheeku");
        t.add("durga");
        System.out.println(t);   // [akshu,cheeku,durga,neelu]

        TreeSet<Integer> t1 = new TreeSet<Integer>();
        t1.add(10);
        t1.add(5);
        t1.add(2);
        t1.add(20);
        System.out.println(t1);

        TreeSet t2 =new TreeSet();
        t2.add(10);
        t2.add("neelu");   // java.lang.Class CastException

        TreeSet t3 = new TreeSet();
        t3.add("neelu");
        t3.add(null);    // java.lang.nullPointException

    }
}
