package collectionMap;

import java.util.*;

public class Test2 {
    public static void main (String[]args){
        LinkedHashMap<Emp,Student>h =new LinkedHashMap<Emp,Student>();
        h.put(new Emp(111,"neelu"),new Student(1,"cheeku"));
        h.put(new Emp(222,"durga"),new Student(2,"akshu"));

        Set<Emp>s = h.keySet();
        for(Emp e:s){
            System.out.println(e.eid+" "+e.ename);
        }
        for(Emp ee : h.keySet()){
            System.out.println(ee.eid+" "+ee.ename);
        }
        //print the values
        for(Student s1: h.values()) {
            System.out.println(s1.sid + " " + s1.sname);
        }
        Set<Map.Entry<Emp,Student>>ss = h.entrySet();
        Iterator<Map.Entry<Emp,Student>> itr = ss.iterator();
        while(itr.hasNext()){
            Map.Entry<Emp,Student> e = itr.next();
            Emp ee = e.getKey();
            System.out.println(ee.eid+" "+ee.ename);
            Student stu = e.getValue();
            System.out.println(stu.sid+" "+stu.sname);
        }
    }
}
