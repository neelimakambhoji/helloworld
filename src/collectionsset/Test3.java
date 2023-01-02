package collectionsset;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        TreeSet<Product> t1 = new TreeSet<Product>(new MyCom2());
        t1.add(new Product(111, "chair", 95.78));
        t1.add(new Product(333, "fan", 65.43));
        t1.add(new Product(222, "sofa", 99.54));
        t1.add(new Product(444, "soap", 64.76));
        for (Product p : t1) {
            System.out.println(p.id + " " + p.name + " " + p.cost);
        }
    }
}
        class MyCom2 implements Comparator<Product>{

            @Override
            public int compare(Product p1, Product p2) {
                return -p1.name.compareTo(p2.name);


            }
        }



