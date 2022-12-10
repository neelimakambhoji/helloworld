package assgnments.arrays;

import java.util.Scanner;

public class ExaIfElse101 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number :");
        int number = scanner.nextInt();
        if(number%2==0) {
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
        scanner.close();
    }

}
