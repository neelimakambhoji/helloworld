package collectionassigns;

import java.util.LinkedList;
import java.util.ListIterator;

public class BankMain {
    public static void main(String[]args){
        LinkedList<Bank> ll = new LinkedList<Bank>();
        ll.add(new Bank(111,"city","neelu"));
        ll.add(new Bank(222,"chase","akshu"));
        ll.add(new Bank(333,"us","cheeku"));

        //by using ListIterator remove chase
        ListIterator<Bank>lstr = ll.listIterator();
        lstr.add(new Bank(444,"capital","vijay"));
        while(lstr.hasNext()){
            Bank b = lstr.next();
            if(b.name.equals("chase"))
                lstr.remove();

        }
        // print the data for each loop()
        for( Bank b: ll) {
            System.out.println(b.id + " " + b.name + " " + b.author);
        }

    }
}
