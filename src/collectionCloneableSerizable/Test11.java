package collectionCloneableSerizable;

import java.io.*;
import java.util.ArrayList;

public class Test11 {
    public static void main(String[]args) throws IOException, ClassNotFoundException {
        ArrayList<Emp> al= new ArrayList<>();
        al.add(new Emp(111,"neelu")) ;
        al.add(new Emp(222,"cheeku"));
        al.add(new Emp(333,"akshu"));

        // serialization of ArrayList : Writing the object
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close();
        System.out.println("serialization process completed");

        //Deserialization of arrayList : reading the object
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Emp> newal = (ArrayList<Emp>)ois.readObject();
        for(Emp e : newal){
            System.out.println(e.eid+" "+e.ename);
        }
        ois.close();
    }
}
