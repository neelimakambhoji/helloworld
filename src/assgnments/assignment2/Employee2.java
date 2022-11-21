package assgnments.assignment2;

import java.lang.*;
public class Employee2 {
    public static void main(String[]args){
     // initializing an object (creating object from class - no args constructor
     // setters method values set (assigning values)
     // getters method you are retrieving
        Employee employee = new Employee();
         employee.setFirstName("neelima");
         employee.setLastName("kambhoji");
         employee.setId(5);
         employee.setSalary(5000);
         System.out.println("firstname : " + employee.getFirstName());
         System.out.println("lastname  : " + employee.getLastName());
         System.out.println("   id     : " + employee.getId());
         System.out.println("   salary  : " +  employee.getSalary());
         System.out.println("***************************");
         Employee employee1 = new Employee();
         employee1.setFirstName("Vijay");
         employee1.setLastName("kambhoji");
         employee1.setId(10);
         employee1.setSalary(3000.50);
         System.out.println("firstname : " + employee1);


         // overloading 2 constructors
        // firstname, lastname
        // firstname, lastname, id
       // firstname, lastname, id, salary
    }
}
