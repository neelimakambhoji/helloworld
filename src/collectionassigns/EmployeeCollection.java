package collectionassigns;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection {

    public List<Employee> getEmployees() {
         ArrayList<Employee> employees = new ArrayList<>();
         employees.add(new Employee("Ratna", "Akula", 50, 2000.00));
        employees.add(new Employee("Neelima", "Kambhoji", 30, 4000.00));
        employees.add(new Employee("Vijay", "Kambhoji", 35, 3000.00));
        employees.add(new Employee("SomeFirst", "SomeLast", 20, 1000.00));
        return employees;
    }
}
