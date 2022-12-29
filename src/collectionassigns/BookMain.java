package collectionassigns;

import java.util.ArrayList;
import java.util.ListIterator;

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> objs = new ArrayList<Book>();
        objs.add(new Book(111, "c", " Dennis Ritchie"));
        objs.add(new Book(222, "c++", "Bjarne Stroustrup"));
        objs.add(new Book(333, "python", "Guido Van Rossum"));
        objs.add(new Book(444, "java", "James Gosling"));
        //Read the Data using for Each Loop()
        for (Book b : objs) {
           // if(o instanceof Book)
            System.out.println(b.bid +" "+ b.bname + " " + b.bauthor);
        }
        System.out.println("********************************************************");
        // Read the Data using get ()Method
        Book b = objs.get(3);
        System.out.println(b.bid +" "+ b.bname + " " + b.bauthor);
        System.out.println("*********************************************************");
        // Read the Data using ListIterator <generic>
        ListIterator<Book> litr = objs.listIterator();
        while (litr.hasNext()) {
            Book bb =litr.next();
            System.out.println(b.bid +" "+ b.bname + " " + b.bauthor);
        }
        System.out.println("*****************************************************");
        // Read the Data using forEach ()Method : using Lambda
        objs.forEach(bb->System.out.println(b.bid+ " "+ b.bname+ " "+ b.bauthor));

    }
}