package assgnments.assignments1;

public class Math {

    // add function with integer parameters
    public int add(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    //add  function with float parameters
    public float add(float num1, float num2){
        float total = num1 + num2;
        return total;
       }
     // add function with double parameters
     public double add(double num1, double num2){
        double total = num1 + num2;
        return total;
     }
    // subtract function with integer parameters
    public int subtract(int num1, int num2) {
        int Total = num1 - num2;
        return Total;
    }

    // subtract function with float parameters
      public float subtract(float num1, float num2) {
          float Total = num1 - num2;
               return Total;
      }
      //subtract function with double parameters
       public double subtract(double num1, double num2){
           double Total = num1 - num2;
                return Total;
    }

      // multiply function with integer parameters
          public int multiply(int num1, int num2){

              int Total = num1 * num2;
                    return Total;
          }
         public float multiply(float num1, float num2) {
             float Total = num1 * num2;
             return Total;
         }
       // multiply function with double parameters
          public double multiply(double num1, double num2){
               double Total = num1 * num2;
                  return Total;
          }
          // divide function with integer parameters
          public int divide(int num1, int num2){
              int Total = num1 / num2;
              return Total;
          }
          public float divide(float num1, float num2){
                  float Total = num1 / num2;
                       return Total;
          }
          //divide function with double parameters
          public double divide(double num1,double num2){
                    double Total = num1 / num2;
                    return Total;
          }
          // modulo function with integer parameters
          public int modulo(int num1, int num2){
              int Total = num1 % num2;
                   return Total;
          }
          public float modulo(float num1, float num2){
                float Total = num1 % num2;
                    return Total;
          }
          // modulo function with double parameters
            public double modulo(double num1, double num2){
              double Total = num1 % num2;
                 return Total;
            }
          // print method without returning
          public void print(int num1, int num2, int total) {
              System.out.println(num1 + " " + num2 + " " + total);
          }
          public void print(float num1, float num2, float total){
                  System.out.println(num1 + " " + num2 + " " + total);
            }
           public void print(double num1, double num2, double total){
               System.out.println(num1 + " " + num2 + " " + total);
           }
          }

