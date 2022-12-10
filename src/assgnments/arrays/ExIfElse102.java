package assgnments.arrays;

import java.util.Scanner;

public class ExIfElse102 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the marks :");
        int marks = scanner.nextInt();
        if(marks<35)
            System.out.println("student is failed");
            else if(marks ==35)
            System.out.println("student is just passed");
            else if(marks>35 && marks<70)
            System.out.println("student is secured third class");
            else if(marks>=70 && marks<85)
            System.out.println("student is Secured second class");
            else
            System.out.println("student is Secured First class");
        scanner.close();
    }
}
