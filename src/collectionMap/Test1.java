package collectionMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main (String []args){
        HashMap<Integer,String> h = new HashMap<Integer, String>();
        h.put(55,"neelu");
        h.put(77,"akshu");
        h.put(33,"cheeku");
        h.put(99,"durga");
        h.put(55,"neelu");
        System.out.println(h); // [33=cheeku,99=durga,55=neelu,77=akshu]

        Set<Integer> s = h.keySet();
        System.out.println(s);     // [ 33,99,55,77]
        Collection<String> c = h.values();
        System.out.println(c);       // [ cheeku,durga,neelu,akshu]
        Set<Map.Entry<Integer,String>> s1 = h.entrySet();
        for(Map.Entry<Integer,String> e :s1){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
