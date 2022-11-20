package assgnments.assignments3;

public class Bird {
    private String name;
    private String type;
    private int years;
    private double price;


    public Bird(){

    }
        Bird(String name,String type,int years,double price){
       this.name = name;
       this.type = type;
       this.years = years;
       this. price = price;
    }


    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", years=" + years +
                ", price=" + price +
                '}';
    }
}
