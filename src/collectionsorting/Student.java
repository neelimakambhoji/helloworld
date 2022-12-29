package collectionsorting;

public class Student implements Comparable<Student>{
    // Sorting using name generic version of comparable
    int sid;
    String sname;
    public Student(int sid,String sname){
        this.sid = sid;
        this.sname = sname;
    }

    @Override
    public int compareTo(Student s) {

        return sname.compareTo(s.sname);
    }
}
