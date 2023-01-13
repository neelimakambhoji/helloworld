package collectionCloneableSerizable;

import java.util.ArrayList;

public class Test2 {
    public static void main(String []args){
        ArrayList<String>al = new ArrayList<String>();
        al.add("neelu");
        al.add("akshu");
        al.add("cheeku");
       ArrayList<String>copy =(ArrayList<String>)al.clone();
       System.out.println(copy);
    }
}
