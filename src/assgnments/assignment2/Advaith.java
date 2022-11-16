package assgnments.assignment2;

public class Advaith {
     String name;
     int age;
     int weight;
     // OverloadingMethod = methods that share the same name but have different parameters and return type.(method name+parameters=method signature)
    public Advaith(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Advaith(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }



}
