package loopStatments;

import java.util.Scanner;

public class ExWhile{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the starting number :");
        int startingNumber = scanner.nextInt();
        System.out.println("please enter the ending number :");
        int endingNumber = scanner.nextInt();
        int number=startingNumber;
        while(number<= endingNumber){
            System.out.println(number);    //print 1to100values
            number++;
        }
        scanner.close();
    }
}
