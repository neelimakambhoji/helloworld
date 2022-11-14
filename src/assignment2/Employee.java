package assignment2;

  public class Employee {
      private String FirstName;

      private String lastName;
      private int id;
      private double salary;

      public void setfirstname(String FirstName) {
          this.FirstName = FirstName;
      }

      public String getfirstname() {
          return FirstName;
      }

      public void setLastName(String lastName) {
          this.lastName = lastName;
      }

      public String getLastName() {
          return lastName;
      }

      public void setId(int id) {
          this.id = id;
      }

      public int getId() {
          return id;
      }

      public void setSalary(double salary) {
          this.salary = salary;
      }

      public double getSalary() {
          return salary;
      }

  }
