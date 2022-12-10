package assgnments.arrays;

import java.util.Scanner;

public class ExIfElse103 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the Day name:");
        String dayName = scanner.next();
        if(dayName.equals("Monday")||
            dayName.equals("Tuesday")||
            dayName.equals("Wednesday")||
            dayName.equals("Thursday")||
            dayName.equals("Friday"))
            System.out.println("uff,It's a Weekday");
         else if (dayName.equals("Saturday")||
                dayName.equals("Sunday"))
            System.out.println("yayy,It's a Weekend");

        scanner.close();
    }
}
