package collectionsset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>(new MyComp());
        t.add("neelu");
        t.add("akshu");
        t.add("durga");
        t.add("cheeku");
        System.out.println(t); // [akshu,cheeku,durga,neelu]

        TreeSet<Integer>t1 =new TreeSet<Integer>(new MyComp1());
        t1.add(10);
        t1.add(7);
        t1.add(2);
        t1.add(20);
        System.out.println(t1);  //[2,7,10,20]

    }
}
      class  MyComp implements Comparator<String> {

          @Override
          public int compare(String s1, String s2) {
              return -s1.compareTo(s2);
          }
      }

       class MyComp1 implements Comparator<Integer> {

           @Override
           public int compare(Integer i1, Integer i2) {
               return -i1.compareTo(i2);
           }
       }




