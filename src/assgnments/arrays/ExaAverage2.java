package assgnments.arrays;

public class ExaAverage2 {
    public static void main(String[]args){  //print the average of the integer in an integer array.
        int[]num = {2,5,1,9,6};
        int total = 0;
        for(int e: num){
            total = total+ e;
        }
        System.out.println("total :" + total);
        System.out.println("avg is : " + (total/num.length));
    }
}
