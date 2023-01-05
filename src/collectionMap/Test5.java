package collectionMap;

import java.util.TreeMap;

public class Test5 {
    public static void main (String[]args){
        // adding one map to another map
       // 1 constructor approach  2. put all()
        TreeMap<String,Integer> t1 = new TreeMap<String,Integer>();
        t1.put("neelu",111);
        TreeMap<String,Integer> t2 = new TreeMap<String,Integer>(t1);
        t2.put("akshu",222);
        System.out.println(t2);   //[akshu=222,neelu=111]
        //putAll();
        TreeMap<String,Integer> m1 = new TreeMap<String,Integer>();
        m1.put("aaa",1);
        m1.put("a",2);
        TreeMap<String,Integer> m2 = new TreeMap<String,Integer>();
        m2.put("bbb",1);
        m2.put("b",2);
        TreeMap<String,Integer> m3 = new TreeMap<String,Integer>();
        m3.putAll(m1);
        m3.putAll(m2);
        m3.put("ccc",3);
        System.out.println(m3);  //[a=2,aaa=1,b=2,bbb=1,ccc=3]
    }
}
