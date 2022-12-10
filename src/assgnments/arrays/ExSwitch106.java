package assgnments.arrays;

import java.util.Scanner;

public class ExSwitch106 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number :");
        int number1 = scanner.nextInt();
        System.out.println("please enter the second number :");
        int number2 = scanner.nextInt();
        System.out.println("please enter the  target operator :");
        String operation = scanner.next();
        int result = 0;
        switch(operation){
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1-number2;
                break;
            case "*":
                result = number1*number2;
                break;
            case "/":
                result = number1/number2;
                break;
            case "%":
                result = number1%number2;
                break;
            default:
                System.err.println("Invalid operation!!");
              break;
        }
        System.out.println(result);
        scanner.close();
    }
}
