package collectionMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test6 {
    // constructor 3: treemap with sorted map
    //TreeMap(SortedMap,k)
    public static void main(String[]args){
        TreeMap<Integer,String>t1 =new TreeMap<Integer,String>();
        t1.put(3,"neelu");
        t1.put(10,"akshu");
        t1.put(1,"cheeku");
        t1.put(30,"ratan");
        t1.put(5,"durga");
        t1.put(20,"neelu");
    System.out.println(t1);  //{1=cheeku, 3=neelu, 5=durga, 10=akshu, 20=neelu, 30=ratan}

        SortedMap<Integer,String>sm1 = t1.subMap(3,10);
        TreeMap<Integer,String>t2 = new TreeMap<Integer,String>(sm1);
        System.out.println(t2); //{3=neelu, 5=durga}

        SortedMap<Integer,String>sm2 = t1.tailMap(10);
        TreeMap<Integer,String>t3 = new TreeMap<Integer,String>(sm2);
        System.out.println(t3);   //{10=akshu, 20=neelu, 30=ratan}

        SortedMap<Integer,String>sm3 = t1.headMap(10);
        TreeMap<Integer,String>t4 = new TreeMap<Integer,String>(sm3);
        System.out.println(t4);  //{1=cheeku, 3=neelu, 5=durga}




    }
}
