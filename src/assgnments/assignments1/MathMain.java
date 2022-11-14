package assgnments.assignments1;

public class MathMain {

    // this is an executable class
    public static void main(String[] args) {
        int num1 = 20; // initialize and assigning
        int num2 = 10;
        // you created a class, you included methods and functions
        // method it won't return anything and do something (return type - void)
        // functions (float type and int type and double type, you want to pass parameters you want to return )

        // integer type
        Math math = new Math();
        int addTotal = math.add(num1, num2); // it is returning, it is function
        math.print(num1, num2, addTotal); // it won't return anything, but do something

        // float type
        float floatnum1 =1.0f;
        float floatnum2 =2.0f;
        float addfloatTotal = math.add(floatnum1, floatnum2); // it is returning, it is function
        math.print(floatnum1, floatnum2, addfloatTotal);


       // overload type (double)
        double x = 30;
        double y = 20;
        double adddoubleTotal = math.add(x, y);
        math.print(x, y, adddoubleTotal);


        // subtract method (integer)
        int subTotal = math.subtract(num1, num2);
        math.print(num1, num2, subTotal);

        float subfloatTotal = math.subtract(floatnum1, floatnum2);
        math.print(floatnum1, floatnum2, subfloatTotal);

        // double subtract
        double subdoubleTotal = math.subtract(num1, num2);
        math.print(x, y,subdoubleTotal);

        //Multiplication method (int)
        int multiplyTotal = math.multiply( num1,  num2);
        math.print(num1, num2, multiplyTotal);

        //multiplication method float
        float floatmultiplyTotal = math.multiply(floatnum1, floatnum2);
        math.print(floatnum1, floatnum2, floatmultiplyTotal);

        // multiply double
        double doublemultiplyTotal = math.multiply(num1, num2);
        math.print(x, y, doublemultiplyTotal);

        // Divide method - int
        int divideTotal = math.divide(num1, num2);
        math.print(num1, num2, divideTotal);

        // divide float
        float floatdivideTotal = math.divide(floatnum1, floatnum2);
        math.print(num1, num2, floatdivideTotal);

        // divide double
        double doubledivideTotal =math.divide( num1, num2);
        math.print(x,y, doubledivideTotal);

        //modulo method type (int)
        int moduloTotal = math.modulo(num1,num2);
        math.print(num1, num2, moduloTotal);

        // modulo method type (float)
        float floatmoduloTotal = math.modulo(floatnum1, floatnum2);
        math.print(floatnum1, floatnum2, floatmoduloTotal);

        // modulo method type (double)
        double doublemoduloTotal = math.modulo(num1,num2);
        math.print(x,y, doublemoduloTotal);
    }
}
