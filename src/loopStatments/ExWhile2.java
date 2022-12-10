package loopStatments;

import java.util.Scanner;

public class ExWhile2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the starting number :");
        int startingNumber = scanner.nextInt();
        System.out.println("please enter the ending number :");
        int endingNumber = scanner.nextInt();
        int number=startingNumber;
        while(number<=endingNumber){
            if(number%2==0)
                System.out.println(number);
            number++;
        }
        scanner.close();
    }
}
