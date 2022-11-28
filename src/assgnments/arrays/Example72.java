package assgnments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example72 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the array size :");
        int arrSize = scanner.nextInt();
        String[] arr = new String[arrSize];
        System.out.println("please enter the array value :");
        for(int i=0;i< arr.length;i++){
            arr[i] = scanner.next();
        }
        System.out.println("Input :" + Arrays.toString(arr));
        String minLengthWord = arr[0];
        int minLengthWordIndex =0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].length() < minLengthWord.length()) {
                minLengthWord = arr[i];
                minLengthWordIndex = i;
            }

            System.out.println("min Length Word :" + minLengthWord);
            System.out.println("min Length Word Index :" + minLengthWordIndex);
        }
        scanner.close();
    }
}
