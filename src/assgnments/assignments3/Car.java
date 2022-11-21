package assgnments.assignments3;

public class Car {
    String make = "Bmw";
    String model = "Suv";
    String color = "White";
    int year = 2022;
    double price = 30000;

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}