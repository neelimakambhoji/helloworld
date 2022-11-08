package assgnments.assignments1;

public class MathMain {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        Math math = new Math();
        int addTotal = math.add(num1, num2); // it is returning, it is function
        math.print(num1, num2, addTotal); // it won't return anything, but do something
        float floatnum1 =1.0f;
        float floatnum2 =2.0f;
        float addfloatTotal = math.add(floatnum1, floatnum2); // it is returning, it is function
        math.print(num1, num2, addTotal);
        double x = 30;
        double y = 20;
        double adddoubleTotal =math.add(num1, num2);
        math.print(num1, num2, addTotal);
        // subtract method
        int subTotal = math.subtract(num1, num2);
        math.print(num1, num2, subTotal);
        float subfloatTotal = math.subtract(floatnum1, floatnum2);
        math.print(num1, num2, subTotal);
        double subdoubleTotal = math.subtract(num1, num2);
        math.print(num1, num2,subTotal);
        //Multiplication method
        int multiplyTotal = math.multiply( num1,  num2);
        math.print(num1, num2, multiplyTotal);
        float floatmultiplyTotal = math.multiply(floatnum1, floatnum2);
        math.print(num1, num2, multiplyTotal);
        double doublemultiplyTotal = math.multiply(num1, num2);
        math.print(num1, num2, multiplyTotal);
        // Divide method
        int divideTotal = math.divide(num1, num2);
        math.print(num1, num2, divideTotal);
        float floatdivideTotal = math.divide(floatnum1, floatnum2);
        math.print(num1, num2, divideTotal);
        double doubledivideTotal =math.divide( num1, num2);
        math.print(num1, num2, divideTotal);
        //modulo method
        int moduloTotal = math.modulo(num1,num2);
        math.print(num1, num2, moduloTotal);
        float floatmoduloTotal = math.modulo(floatnum1, floatnum2);
        math.print(num1, num2, moduloTotal);
        double doublemoduloTotal = math.modulo(num1,num2);
        math.print(num1, num2, moduloTotal);
    }
}
