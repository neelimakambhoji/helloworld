package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the arr Size :");
        int arrSize =  scanner.nextInt();
        boolean[]arr = new boolean[arrSize];
        System.out.println("please enter the arr values :");
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextBoolean();
        }
         System.out.println("input :" + Arrays.toString(arr));
        boolean[] revArr = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            revArr[arr.length - i -1] = arr[i];

            }
        System.out.println("output :"+ Arrays.toString(revArr));
           scanner.close();
        }
    }

