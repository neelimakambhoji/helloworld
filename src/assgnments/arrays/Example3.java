package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the array size:");
         int arrSize = scanner.nextInt();
         int[]arr = new int[ arrSize];
         System.out.println("please enter the array values:");
         for(int i=0; i < arrSize; i++){
             arr [i] = scanner.nextInt();
         }

         System.out.println("input :" +Arrays.toString(arr));
        // int[]a ={2,5,1,9,6};   //n-5   n-1 =4
         int sum =0;
         // int lengthOfArray = numbers.length;
       for(int i=0; i<arr.length;i++){       //0 1 2 3 4  //a.length=5

           sum = sum + arr[i]; //2 + 5 + 1 + 9 + 6
    }

            System.out.println("output: "+ sum);


     scanner.close();

    }
    }
