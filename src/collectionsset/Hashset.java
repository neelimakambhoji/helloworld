package collectionsset;

import java.util.HashSet;

public class Hashset {
    public static void main(String []args){
        HashSet<String>h = new HashSet<String>();
        h.add("neelu");
        h.add("akshu");
        h.add("cheeku");
        h.add("neelu");
        System.out.println(h);
        HashSet<String>h1= new HashSet<String>();
        System.out.println(h1.add("neelu"));
        System.out.println(h1.add("neelu"));
        System.out.println(h1.add("neelu"));
        System.out.println(h1.add("neelu"));
        System.out.println(h1);
    }
}
