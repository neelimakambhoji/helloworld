package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExCommonElements2arrays96 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of row:");
        int rowSize_arr1 =  scanner.nextInt();
        int[][]arr1 = new int[rowSize_arr1][];
        for(int i=0;i<rowSize_arr1;i++){
            System.out.println("please enter the number of colum size:"+i);
            int colSize = scanner.nextInt();
            arr1[i] = new int[colSize];
            System.out.println("please enter the colum values of row number:"+i);
            for(int j=0;j<colSize;j++){
                arr1[i][j]= scanner.nextInt();
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
        System.out.println("Input1:");
        for(int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("Input2:");
        for(int i=0;i<arr2.length;i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                int targetElement = arr1[i][j];
                for(int k=0;k<arr2.length;k++){
                    for(int l=0;l<arr2[k].length;l++){
                        if(targetElement==arr2[k][l]){
                            System.out.println(targetElement);
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
