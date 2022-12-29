package collectionassigns;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx2 {
    public static void main(String[]args){
        ArrayList<String>objs = new ArrayList<String>(Collections.nCopies(10,"neelu"));
        System.out.println(objs);

        ArrayList<String>a1 =new ArrayList<String>();
        a1.add("Advaith");
        a1.add("kavitha");
        a1.add("Raju");
        a1.add("Rani");
        System.out.println("before swapping : "+a1);
        Collections.swap(a1,1,3);  // [ Advaith,Rani,raju kavita,]
        System.out.println("After swapping : "+ a1);
    }
}
