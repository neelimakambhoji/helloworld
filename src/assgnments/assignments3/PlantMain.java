package assgnments.assignments3;

import java.util.Scanner;

public class PlantMain {
    public static void main (String[]args){
        Scanner scanner = new Scanner((System.in));
        System.out.println("Please enter plant name");
        String plantName = scanner.next();
        String plantType = scanner.next();
        float price = scanner.nextFloat();
        Plant plant = new Plant(plantName,plantType,price);
        System.out.println(plant);
    }
}
