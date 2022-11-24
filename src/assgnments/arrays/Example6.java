package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please print the array1 Size :");
        int arr1Size = scanner.nextInt();
        int[] arr1 = new int[arr1Size];
        System.out.println("please enter the array1 value");
        for (int i = 0; i < arr1Size; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("please enter the arr2 size:");
        int arr2Size = scanner.nextInt();
        int[] arr2 = new int[arr2Size];
        System.out.println("please enter the arr2 value:");
        for (int i = 0; i < arr2Size; i++) {
            arr2[i] = scanner.nextInt();
        }
        System.out.println("input:" + Arrays.toString(arr1));
        System.out.println("input :" + Arrays.toString(arr2));

        int[]arr3 = new int[arr1.length+arr2.length];
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
