package collectionassigns;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx4 {
    public static void main(String[]args){
        //conversion of arrays to collection
        String[]str = { "raju","rani","anu","akshu"};
      ArrayList<String>objs = new ArrayList<String>(Arrays.asList(str));
      objs.add("cheeku");
      objs.add("Neelu");
      System.out.println(objs);
      System.out.println("**********");
      //generic version: collection to arrays
      ArrayList<String> a1 = new ArrayList<String>();
      a1.add("raju");
      a1.add("rani");
      a1.add("anu");
     String[]s = new String[a1.size()];
     a1.toArray(s);
     for(String ss:s) {
         System.out.println(ss);
     }
        System.out.println("**********");
         //normal version collection to arrays
        ArrayList data = new ArrayList();
       data.add(10);
       data.add("veru");
       data.add(10.5);
       Object[]o = data.toArray();
       for(Object oo: o){
           System.out.println(oo);
       }
    }
}
