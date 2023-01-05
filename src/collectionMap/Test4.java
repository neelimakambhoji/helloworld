package collectionMap;

import java.util.TreeMap;

public class Test4 {
    public static void main(String[]args){
        //constructs a new empty tree map, using the natural ordering of its keys.
        TreeMap<String,Integer> t =new TreeMap<String,Integer>();
        t.put("neeli",111);
        t.put("raju",222);
        t.put("ravi",444);
        t.put("ragu",333);
        System.out.println(t);//{neeli=111, ragu=333, raju=222, ravi=444}

       TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();
        t1.put(1, "neeli");
         t1.put(2,"raju");
        t1.put(3, "ravi");
        t1.put(4, "ragu");
        System.out.println(t1);//{1=neeli, 2=raju, 3=ravi, 4=ragu}

    }
}
