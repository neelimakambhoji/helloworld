package collectionassigns;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[]args){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("neelu");
        al.add(10.5);
        al.add("neelu");
        al.add(null);
        System.out.println(al);         //[10,neelu,10.5,neelu,null]
        System.out.println(al.size());   //5

         al.add(3,"Akshu");
         System.out.println(al);         //[10,neelu,10.5,Akshu,null]

        al.remove(5);
         al.remove("raju");            //[10,neelu,10.5,Akshu,Raju}
        System.out.println(al);

        al.set(1,"Rani");                  //[10,Rani,10.5,Akshu,Raju];
        System.out.println(al);

        System.out.println(al.isEmpty());     // false
        al.clear();
        System.out.println(al.isEmpty());      //true


    }
}
