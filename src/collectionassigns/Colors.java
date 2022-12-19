package collectionassigns;


import java.util.ArrayList;

public class Colors {
    public static void main(String[]args){
       // in an  ArrayList,we can store objects(String,Integer,Boolean,Double,Character...)
       // not a primitive type(int,boolean,double,char...)
        ArrayList<String>al = new ArrayList<>();
        // using the add() method
        al.add("blue");
        al.add("green");
        al.add("pink");
        al.add("black");
        al.add("white");
        System.out.println(al); // [blue, green,pink,black,white]
        al.add(0,"AtIndex yellow");
        System.out.println(al);
         al.add(3,"AtIndex peach");
         System.out.println(al);
        // using the get()
        String element = al.get(0);
        System.out.println(element);
        String element2 = al.get( 3);
        System.out.println(element2);
        String element3 = al.get(5);
        System.out.println(element3);

        //using the set() method
        al.set(2,"orange");  //change green to orange
        System.out.println(al); // [yellow,blue,orange,peach,pink,white]

        // using the remove()
        al.remove(1); //remove the element at index 1
        System.out.println(al);
        al.remove("blue"); //remove the element blue
        System.out.println(al); // [ yellow,orange,peach, pink,black,white]

        // using Size() method
        al.size();
        System.out.println(al.size()); //6
        al.remove("white");
        System.out.println(al.size()); //5
        al.add("blue");
        System.out.println(al.size()); //6
        al.clear();
        System.out.println(al.size()); //0

        // removing all elements, use the clear() method
        al.clear(); // remove all elements
        System.out.println(al); //[]

      //loop through an arrayList
        for(int i=0;i < al.size();i++){
            System.out.println(al.get(i) + " ");
        }
    }
}
