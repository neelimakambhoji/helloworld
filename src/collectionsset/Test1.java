package collectionsset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test1 {
    public static void main(String[] args) {
        LinkedHashSet<String> h1 = new LinkedHashSet<String>();
        h1.add("neelu");
        h1.add("akshu");
        HashSet<String> h2 = new HashSet<String>(h1);
        h2.add("cheeku");
        System.out.println(h2);

        //addAll();
        LinkedHashSet<String> h11 = new LinkedHashSet<String>();
        h11.add("neelu");
        LinkedHashSet<String> h22 = new LinkedHashSet<String>();
        h22.add("akshu");
        LinkedHashSet<String> h33 = new LinkedHashSet<String>();
        h33.addAll(h11);
        h33.addAll(h22);
        h33.add("cheeku");
        System.out.println(h33);
    }
}