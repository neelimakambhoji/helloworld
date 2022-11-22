package assgnments.arrays;

public class Example2 {
    public static void main(String[] args) {
        int[]intArray = new int[10];
        for (int i = 0; i < 10;  i++) {
            intArray[i] = i + 1;
        }
        for(int i =0; i<10; i++){
            System.out.println(intArray[i]);
        }
        String[] Names = new String[4];
        for (int i = 0; i < 4; i++){
            if( i == 0){
                Names [i] = "NEELU";
            }
            if(i == 1) {
                Names[i] = "AKSHU";
            }
            if(i == 2){
                Names[i] = "VIJAY";
            }
            if(i== 3){
                Names[i] = "CHEEKU";
            }

          for(int i1 = 0; i1 < 4; i1++){
              System.out.println(Names [i]);
          }

        }
    }
}