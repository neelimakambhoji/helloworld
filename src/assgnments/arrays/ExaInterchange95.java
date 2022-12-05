package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExaInterchange95 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of rows:");
        int rowSize = scanner.nextInt();
        int[][]arr = new int[rowSize][];
        for(int i=0;i<rowSize;i++) {
            System.out.println("please enter the number of colum size:"+i);
            int colSize = scanner.nextInt();
            arr[i]=new int[colSize];
            System.out.println("please enter the colum values of row number:"+i);
            for(int j=0;j<colSize;j++){
                arr[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Input:");
        for (int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int[][]outputArr=new int[arr.length][];
        for(int i=0;i<arr.length;i++) {
            outputArr[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                outputArr[i][j] = arr[j][i];  //a00=a00//a01=a10//a23=a32
            }
        }
            System.out.println("output:");
            for (int i=0;i< outputArr.length;i++){
                System.out.println(Arrays.toString(outputArr[i]));

        }
        scanner.close();
    }
}
