package assgnments.assignment2;

public class Employee1 {
     String firstname;
     String lastname;
     int id;
     double salary;
   // No args constructor
    public Employee1(){
    }
    public Employee1(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname   = lastname;
    }
    public Employee1(String firstname,String lastname,int id){
        this.firstname = firstname;
        this.lastname  = lastname;
        this.id        = id;
    }
    public Employee1(String firstname,String lastname,int id,double salary){
        this.firstname = firstname;
        this.lastname  = lastname;
        this.id        = id;
        this.salary    = salary;
    }



    }

