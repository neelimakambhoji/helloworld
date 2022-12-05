package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExaCommonElements94 {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter the number of rows in arr1  :");
        int rowSize = scanner.nextInt();
        int[][]arr1 = new int[rowSize][];
        for(int i=0;i<rowSize;i++){
            System.out.println("please enter the arr colSize elements:"+i);
            int colSze = scanner.nextInt();
            arr1[i] = new int[colSze];

            System.out.println("please enter the arr value of elements:"+i);
            for(int j=0;j<colSze;j++){
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("please enter the number of rows in arr2 :");
        int rowSize_arr2 = scanner.nextInt();
        int[][]arr2 = new int[rowSize_arr2][];
        for(int i =0;i<rowSize_arr2;i++) {
            System.out.println("please enter the column size in row number " + i);
            int colSize = scanner.nextInt();
            arr2[i] = new int[colSize];
            System.out.println("please enter the column values for the row number" + i);
            for (int j = 0; j < colSize; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Input 1:");
        for (int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("Input 2:");
        for (int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));

        }
        int[][] arr3 =new int[arr1.length][];             //create an array based on the mentioned conditions and print in the console
        for(int i=0;i< arr1.length;i++){
            arr3[i]=new int[arr1[i].length];
            for(int j=0;j<arr1[i].length;j++){
               if(arr1[i][j]==arr2[i][j])
                   arr3[i][j]=1;
               else
                   arr3[i][j]=0;
            }

        }
        System.out.println("output:");
        for (int i=0;i<arr3.length;i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
        scanner.close();
    }
}
