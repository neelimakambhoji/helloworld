package assgnments.arrays;

import java.util.Scanner;

public class ExSwitch105 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = scanner.nextInt();
        int reminder = number%2;
        switch(reminder) {
            case 0:
                System.out.println("Given number is even");
                break;
            case 1:
                System.out.println("Given number is odd");
                break;
        }
        scanner.close();
    }
}
