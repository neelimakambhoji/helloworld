package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example71{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the array Size :");
        int arrSize =  scanner.nextInt();
        int[]arr = new int[arrSize];
        System.out.println("please enter the array value :");
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input :" + Arrays.toString(arr));
        int largestNumber = 0;
        int largestNumberIndex =0;
        for(int i=0;i<arr.length;i++){
            if(largestNumber < arr[i]){
               largestNumber =arr[i];
               largestNumberIndex = i;
            }
        }
        System.out.println("largestNumber:" + largestNumber);
        System.out.println("largestNumber Index :" + largestNumberIndex);
        scanner.close();
    }
}
