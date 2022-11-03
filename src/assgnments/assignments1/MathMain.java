package assgnments.assignments1;

public class MathMain {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        Math math = new Math();
        int addTotal = math.add(num1, num2); // it is returning, it is function
        math.print(num1, num2, addTotal); // it won't return anything, but do something
        float  Total = math.add(num1, num2); // it is returning, it is function
        math.print(num1, num2, addTotal);
          System.out.println (add(a,b,2));
        // subtract method
        int subtotal = math.subtract(num1, num2);
        math.print(num1, num2, subtotal);

        //Multiplication method
        int Multiply = math.Multiply(num1, num2);
        math.print(num1, num2, Multiplytotal);

        // Divide method
        int Divide = math.Divide(num1, num2);
        math.print(num1, num2, dividetotal);

        //modulo method
        int Modulo = math.Modulo(num1,num2);
        math.print(num1, num2, modulototal);

    }
}
