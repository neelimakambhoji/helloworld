package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the arr size :");
        int arrSize = scanner.nextInt();
        int[]arr = new int[arrSize];
        System.out.println("please enter the arr values :");
        for(int i =0; i < arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Input :" + Arrays.toString(arr));
          int secondLargestNumber = arr[0];
          int secondLargestIndex = 0;
          for(int i =0;i<arr.length;i++) {
              if (secondLargestNumber < arr[i]) {
                  secondLargestNumber = arr[i];
                  secondLargestIndex = i;
              }
          }
            System.out.println("second Largest Number :" + secondLargestNumber);
        System.out.println("second Largest Index :" + secondLargestIndex);
            scanner.close();
    }
}
