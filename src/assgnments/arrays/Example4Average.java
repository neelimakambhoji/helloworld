package assgnments.arrays;

public class Example4Average {
    public static void main(String[]args){
        int[]a = {2,5,3,9,6};
        int sum = 0;
        int avg = 0;
        // firstWay
      //  for(int e : a){
       //     sum = sum+e;
       // }
        //secondWay
        for(int i = 0; i < a.length;i++){
            sum = sum+a[i];
        }
        System.out.println("sum: "+sum);
        System.out.println("The Avg of value of this array is : "+( sum/a.length));
        // java8: Streams:
      //  OptionalDouble avg = Arrays.stream(a).average();
       // System.out.println(avg.getAsDouble());
    }
}
