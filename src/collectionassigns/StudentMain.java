package collectionassigns;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    private List<Student>studentList = new ArrayList<>();
       private void addStudent(Student student) {
           studentList.add(student);
       }
           private void removeStudentId(int id) {
               for (Student student : studentList) {
                   if (student.getId() == id) {
                       studentList.remove(student);
                   }
               }
           }
         private void ShowStudentList(){
               for(Student student:studentList){
                System.out.println(student.getName()+ " " +student.getId()+ " "+student.getFee()) ;
               }
               }
               private void SearchStudentByName(String name){
           for(Student student : studentList){
               if(student.getName().equals(name)){
                   System.out.println("Information for" + student.getName());
                   System.out.println(student.getId()+ " "+ student.getFee());

               }
           }
       }
       public static void main(String[]args){
           StudentMain studentmain = new StudentMain();

           Student student1 = new Student("neelima",654,876.78);
           Student student2 = new Student("Cheeku",765,6784.98);
           Student student3 = new Student("vimal",786,9876.65);
           Student student4 = new Student("king",543,4321.54);

          studentmain.addStudent(student1);
           studentmain.addStudent(student2);
           studentmain.addStudent(student3);
           studentmain.addStudent(student4);

           studentmain.ShowStudentList();

           studentmain.removeStudentId(3); //vimal
           System.out.println();
           studentmain.ShowStudentList();

           studentmain.SearchStudentByName("king");
           studentmain.SearchStudentByName("nikhil");

       }

}
