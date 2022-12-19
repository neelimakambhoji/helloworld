package collectionassigns;

public class Car {
    public String Brand;
    public int year;
    public double price;

    public String getBmw() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String Bmw, int year, double price){
        this.Brand = Brand;
        this.year = year;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + Brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
