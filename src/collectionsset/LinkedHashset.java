package collectionsset;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashset {
    public static void main(String []args){
        LinkedHashSet<Emp>h = new LinkedHashSet<Emp>();
        h.add(new Emp(111,"neelu"));
        h.add(new Emp(444,"akshu"));
        h.add(new Emp(333,"cheeku"));
        h.add(new Emp(222,"neelu"));

        //print the data Iterator cursor
        Iterator<Emp>itr =h.iterator();
        while(itr.hasNext()){
            Emp e = itr.next();
                  //  System.out.println(e.eid+" "+e.ename);
             if(e.eid==111)
                 itr.remove();
             if(e.ename.equals("akshu"))
                 itr.remove();

        }
        for(Emp e:h){
            System.out.println(e.eid+" "+e.ename);
        }
    }
}
