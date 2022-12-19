package loopStatments;

import java.util.Scanner;

public class ExWhile3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the starting number :");
        int startingNumber = scanner.nextInt();
        System.out.println("please enter the ending number :");
        int endingNumber = scanner.nextInt();
        int number = startingNumber;
        while (number<=endingNumber){
          //  print the numbers which are divisible by 7 for the range of 150 to 200
            if(number%7==0)
                System.out.println(number);
            number++;
        }
        scanner.close();
    }
}
