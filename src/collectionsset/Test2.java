package collectionsset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static  void main(String[]args){
        Set <String> s = new HashSet<String>();
        s.add("neelu");
        s.add("akshu");
        System.out.println(s);
        ArrayList<String>al = new ArrayList<String>();
        al.add("neelu");
        al.add("cheeku");
        al.add("neelu");
        HashSet<String> h = new HashSet<String>(al);
        System.out.println(h);
    }
}
