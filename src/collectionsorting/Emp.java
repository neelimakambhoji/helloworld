package collectionsorting;

public class Emp implements Comparable{
    //sorting of eid using normal version of comparable
    int eid;
    String ename;
    public Emp(int  eid,String ename){
        this.eid = eid;
        this.ename = ename;


        }


    @Override
    public int compareTo(Object o) {
        Emp e= (Emp)o;
        if(eid ==e.eid)
            return 0;
        else if (eid>e.eid)
            return 1;
        else
            return -1;
    }
}
