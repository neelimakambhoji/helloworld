package collectionMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[]args){
        LinkedHashMap<Integer,Product> h = new LinkedHashMap<Integer,Product>();
        h.put(1,new Product(111,"fan",678.32));
        h.put(2,new Product(333,"chair",200.67));
        h.put(3,new Product(444,"sofa",654.32));

        Set<Map.Entry<Integer,Product>> s = h.entrySet();
        Iterator<Map.Entry<Integer,Product>> itr = s.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,Product> e =itr.next();
           Product p = e.getValue();
           if(p.id ==111)
               itr.remove();
           if(p.name.equals("sofa"))
               itr.remove();
           }
        //print the data using for each loop
        for(Map.Entry<Integer,Product> e : h.entrySet()) {
            Product p = e.getValue();
            System.out.println(p.id +" "+p.name+ " "+ p.cost);
        }

        }
    }

