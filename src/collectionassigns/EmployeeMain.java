package collectionassigns;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeCollection employeeCollection = new EmployeeCollection();
        List<Employee> employees = employeeCollection.getEmployees();
      //  employees.
        employees.forEach(emp ->
                System.out.println(emp.getSalary() * .10));
        ArrayList<Integer> nums = new ArrayList<>();
        // generate random numbers (api)100 numbers add them to nums
        int[] numsArray = new int[100];
        Random random = new Random();
        for(int i : numsArray)  {
            nums.add(random.nextInt());
        }
        nums.forEach(num -> System.out.println(num));
    }
}
