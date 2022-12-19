package collectionassigns;

import java.util.ArrayList;
import java.util.List;

public class CarCollection {
    public List<Car> getCar() {
        //List<class_Name> listName = new ArrayList<>();   --basic declaration of ArrayList
        ArrayList<Car> Car = new ArrayList<>();
        Car.add(new Car( "BMW", 2020, 4567.98));
        Car.add(new Car("Mercedes",2023,87654.76));
        Car.add(new Car("Tesla",2032,76543.54));
        return Car;
    }
}
