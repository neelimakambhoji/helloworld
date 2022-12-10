package assgnments.arrays;

import java.util.Scanner;

public class ExSwitch107 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the Day names");
        String dayName = scanner.next();
        switch(dayName){
            case  "Monday":
            case "Tuesday" :
            case "wednesday" :
            case "Thursday" :
            case "Friday" :
               System.out.println("uff, it's a week day");
                break;
            case "Saturday" :
            case "Sunday" :
                System.out.println("Yayy, it's a week end");
                break;
            default:
                System.out.println("dayName is invalid");
        }
        scanner.close();
    }
}
