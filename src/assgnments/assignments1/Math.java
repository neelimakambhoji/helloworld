package assgnments.assignments1;

public class Math {

    // add function with integer parameters
    public int add(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }


    // subtract function with integer parameters
    public int subtract(int num1, int num2) {
        int total = num1 - num2;
        return total;
    }

    // multiply function with integer parameters
      public int Multiply(int num1, int num2){
        int total = num1 * num2;
        return total;
      }


    // divide function with integer parameters
       public int Divide(int num1,int num2){
        int total = num1 / num2 ;
        return total;
       }
    // modulo function with integer parameters
    public int Modulo(int num1,int num2) {
        int total = num1 / num2;
        return total;
    }
    // print method without returning
    public void print(int num1, int num2, int total) {
        System.out.println(num1 + " " + num2 + " " + total);
    }

    }

