package collectionMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TestEx {
    public static void main(String[]args){
        TreeMap<Product,Customer>t1 = new TreeMap<Product,Customer>(new MyComp());
        t1.put(new Product(111,"fan",586.66),new Customer(111,"raju", 1976.54));
        t1.put(new Product(222,"chair",543.44),new Customer(222,"ravi",5432.77));
        t1.put(new Product(333,"sofa",6432.54),new Customer(333,"ratan",3243.52));
        System.out.println(t1);

    }
}
     class MyComp implements Comparator<Product>{



         @Override
         public int compare(Product p1, Product p2) {
             return -p1.id;
         }
     }
