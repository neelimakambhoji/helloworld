package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExMultiDimensional {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of rows :");
        int rowSize = scanner.nextInt();
        int[][]arr = new int[rowSize][];

        for(int i =0;i<rowSize;i++){
            System.out.println("please enter the column size in row number " +i);
            int colSize = scanner.nextInt();
            arr[i] =new int[colSize];
            System.out.println("please enter the column values for the row number" +i);
            for(int j = 0; j<colSize;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Input :");
          for(int i = 0; i < arr.length;i++){
              System.out.println("Input :" + Arrays.toString(arr[i]));

          }
          int sum =0 ;
          for(int i = 0; i < arr.length;i++){
              for(int j= 0; j < arr[i].length;j++){
                  sum += arr[i][j];
              }
          }
          System.out.println("output:" +sum);
          scanner.close();
    }
}
