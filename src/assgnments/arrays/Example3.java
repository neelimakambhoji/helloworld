package assgnments.arrays;

public class Example3 {
    public static void main(String[] args){


         int[]a ={2,5,1,9,6};   //n-5   n-1 =4
         int sum =0;



       // int lengthOfArray = numbers.length;
       for(int i=0; i<=a.length-1;i++){

      //0 1 2 3 4  //a.length=5
        sum = sum + a[i]; //2 + 5 + 1 + 9 + 6
    }
        //Enhanced for loop
       // for(int value:a){
       //     sum = sum +value;
       // }
            System.out.println("Sum of array elements: "+ sum);




    }
    }
