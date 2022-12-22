package collectionassigns;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ProductMain {
    public static void main(String []args){
        Vector<Product> product = new Vector<Product>();
        product.add(new Product(44,"pen",10));
        product.add(new Product(22,"pencil",20));
        product.add(new Product(33,"paper",30));

        //Read the data usingIterator generic version
        //apply some condition remove() the product
        Iterator<Product>itr = product.iterator();
        while(itr.hasNext()) {
            Product p = itr.next();
            if (p.id==44)
                itr.remove();

            System.out.println(p.id + " " + p.name + " " + p.cost);
        }
        System.out.println("*************");

        // Read the data using listIterator generic version
        //Add one new product
        ListIterator<Product> lstr = product.listIterator();
       // product.add(new Product(55,"book",40));
        while(lstr.hasNext()){
            Product p = lstr.next();
           // if(p.name==("paper"))
            //    lstr.remove();
          //  if(p.equals("pencil"))
            //    product.set(77,"picture");

            System.out.println(p.id+" "+p.name + " "+p.cost );
        }
        System.out.println("**************************");
        //Read the data using Enumeration generic version
        //print the data
         Enumeration<Product>e = product.elements();
         while(e.hasMoreElements()){
             Product p = e.nextElement();
             System.out.println(p.id+" "+p.name+" "+p.cost);
         }
        }
    }

