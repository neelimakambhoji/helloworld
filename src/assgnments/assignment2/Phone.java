package assgnments.assignment2;

public class Phone {
    String phone = "Apple";
     String model = "pro";
     int year = 2022;
     double price = 1200;

    public Phone (){

    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
