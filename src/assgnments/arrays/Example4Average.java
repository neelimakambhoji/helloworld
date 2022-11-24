package assgnments.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Example4Average {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the array size :");
        int arrSize = scanner.nextInt();
        int arr[]= new int [arrSize];
        System.out.println("please enter the array value :");
        for(int i = 0; i < arrSize; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("input :" + Arrays.toString(arr));
       // int[]a = {2,5,3,9,6};
        int sum = 0;
        int avg = 0;
        // firstWay
      //  for(int e : a){
       //     sum = sum+e;
       // }
        //secondWay
        for(int i = 0; i < arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("sum: "+sum);
        System.out.println("The Avg of value of this array is : "+( sum/arr.length));
        scanner.close();
        // java8: Streams:
      //  OptionalDouble avg = Arrays.stream(a).average();
       // System.out.println(avg.getAsDouble());
    }
}
