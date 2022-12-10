package assgnments.arrays;

import java.util.Scanner;

public class ExIfElse104 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the city Name :");
        String cityName = scanner.next();
        if(cityName.equals("Frisco")||
                cityName.equals("plano")||
                cityName.equals("Richardson"))
            System.out.println("It's a dallas city");
        else if (cityName.equals("huston")||
        cityName.equals("Austin"))
            System.out.println("It's Dallas main cities");
        scanner.close();
    }
}
