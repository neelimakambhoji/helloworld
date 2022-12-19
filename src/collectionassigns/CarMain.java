package collectionassigns;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[]args){
        CarCollection carCollection = new CarCollection();
      //  List<Car>Car = CarCollection.getCar();
      //  Car.forEach(car ->
            //    System.out.println(Car.getPrice() * .10));
                ArrayList<Integer> al = new ArrayList<>();
             al.add(50);
             al.add(2022);
             al.add(4356);
             System.out.println(al); //[50,2022,4356]
        //size()
        System.out.println("number of elements in array list:"+ al.size());  //3
        //remove
        al.remove(2);   //here 2 is index
       // al.remove(2022);  // here 2022 is element
        System.out.println("After removing element in array list :" + al);  //[50,4356]
        //insert a new element
        //add(index,object)
        al.add(1,7654);
        System.out.println("After insertion :" +al); //[50,7654,2022]
        // retreive specific element
        System.out.println(al.get(2)); //here 2 is index of element
        // change element /replace
        al.set(0,30);
        System.out.println("After replacing element :"+ al);
    }
}
