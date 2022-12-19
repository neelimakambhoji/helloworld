package collectionassigns;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
   public static void main(String[]args){
      ArrayList<Integer>List = new ArrayList<>();
      // add elements
      List.add(0);
      List.add(3);
      List.add(4);
      List.add(6);
      List.add(8);
      System.out.println(List);  // [0,3,4,6,8]
      // get elements
      int element = List.get(0);
      System.out.println(element);
      // add element in between
      List.add(3,5);
      System.out.println(List);
      // set element
      List.set(0,1);
      System.out.println(List);
      // delete/remove element
      List.remove(3);
      System.out.println(List);
      // size
      int size = List.size();
      System.out.println(size);
      //loops
      for(int i =0; i< List.size();i++){
         System.out.println(List.get(i));
      }
      System.out.println();

      //sorting
      Collections.sort(List);
      System.out.println(List);
   }
}
