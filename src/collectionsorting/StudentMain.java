package collectionsorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentMain {
    public static void main(String[]args){
        ArrayList<Student>al = new ArrayList<Student>();
        al.add(new Student(111, "neelu"));
        al.add(new Student(444, "cheeku"));
        al.add(new Student(222, "akshu"));
        al.add(new Student(333,"advaith"));
        Collections.sort(al);
        for(Student s : al){
            System.out.println(s.sid +" "+ s.sname);
        }
    }
}
