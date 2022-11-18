package assgnments.assignment2;

public class Employee3 {
    public static void main(String[]args){
        Employee1 employee1 = new Employee1("Akshu","Kambhoji");
        System.out.println(employee1.firstname + " " + employee1.lastname);
        Employee1 employee2 = new Employee1("Advaith","Kambhoji",431);
        System.out.println(employee2.firstname + " " + employee2.lastname + " " + employee2.id);
        Employee1 employee3 = new Employee1("Ratna","Akula",231,3300);
        System.out.println(employee3.firstname + " " + employee3.lastname + " " + employee3.id + " " + employee3.salary);
    }
}
