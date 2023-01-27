package assgnments;

import java.util.Scanner;

public class FlowControlStatements {
    //Take the number from end user check it is even or add?
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number...");
        int num =s.nextInt();
        if (num % 2 == 0) {
            System.out.println("your number is even...");
        }
        else{
            System.out.println("your number is odd...");
        }
        s.close();
    }
}
