package assgnments.assignments1;

public class Math {

    // add function with integer parameters
    public int add(int num1, int num2) {
        int total = num1 + num2;
        return total;

        }

    //Method OverLoad
    public void add(String num1, String  num2) {
        String total = num1 + num2;
        return total;

           Math.math = new Math();
            System.out.print(add(String num1, String num2));
        }


     //add  function with float parameters
       public float add(float num1, float num2){
        float total = num1 + num2;
        return total;
       }
    // subtract function with integer parameters
    public int subtract(int num1, int num2) {
        int total = num1 - num2;
        return total;
    }


    // subtract function with float parameters
      public float subtract(float num1, float num2) {
          float total = num1 - num2;
          return total;
          // multiply function with integer parameters
          public int Multiply (int num1, int num2 ){
              int total = num1 * num2;
              return total;
          }


          // divide function with integer parameters
          public int Divide ( int num1, int num2){
              int total = num1 / num2;
              return total;
          }
          // modulo function with integer parameters
          public int Modulo ( int num1, int num2){
              int total = num1 / num2;
              return total;
          }
          // print method without returning
          public void print ( int num1, int num2, int total){
              System.out.println(num1 + " " + num2 + " " + total);
              public void print( float num1, float num2 float total){
                  System.out.println(num1 + " " + num2 + " " + total);
                  return total;
              }

          }

