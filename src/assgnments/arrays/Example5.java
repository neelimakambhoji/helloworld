package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the array1 Size :");
        int arr1Size = scanner.nextInt();
        String[]arr1 = new String[arr1Size];
        System.out.println("please enter the array1 values :");
        for(int i = 0;i < arr1Size;i++){
             arr1[i] = scanner.next();
        }
        System.out.println("please enter the arr2 size :");
        int arr2Size = scanner.nextInt();
        String[]arr2 = new String[arr2Size];
        System.out.println("please enter the array2 values :");
        for(int i = 0;i < arr2Size;i++) {
            arr2[i] = scanner.next();

            System.out.println("input :" + Arrays.toString(arr1));
            System.out.println("input :" + Arrays.toString(arr2));
        }
        String[]arr3 = new String[arr1.length+arr2.length];
         for(int i=0;i<arr1.length;i++){
             arr3[i] = arr1[i];
         }
        for(int i=0;i<arr2.length;i++) {
            arr3[i+ arr1.length] = arr2[i];
        }
        System.out.println("output :" + Arrays.toString(arr3));


        scanner.close();
    }
}
