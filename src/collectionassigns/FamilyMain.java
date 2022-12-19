package collectionassigns;

import java.util.ArrayList;
import java.util.List;


public class FamilyMain {
    public static void main(String[]args){
        FamilyCollection familyCollection = new FamilyCollection();
        List<Family> families = familyCollection.getFamilies();
       ArrayList <Family> familyArrayList = new ArrayList<>();
      // familyArrayList.add("Neelima");
      // familyArrayList.add("Advaith");
      // familyArrayList.add("Advaith");
         System.out.println("family");

        for(Family f: familyArrayList){
            System.out.println("/n name :" + f.getName());
            System.out.println(" " + f.getAddress());
        }
    }
}
