package assignment2;

public class Employee2 {
    public static void main(String[]args){
        Employee employee = new Employee();
         employee.setfirstname("neelima");
         employee.setLastName("kambhoji");
         employee.setId(5);
         employee.setSalary(5000);
         System.out.println("firstname : " + employee.getfirstname());
         System.out.println("lastname  : " + employee.getLastName());
         System.out.println("   id     : " + employee.getId());
         System.out.println("   salary  : " +  employee.getSalary());
    }
}
