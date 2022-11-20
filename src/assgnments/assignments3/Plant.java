package assgnments.assignments3;

public class Plant {
    private String name;
    private String type;
    private float price;
    public Plant(){

    }
    Plant(String name,String type,float price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
