package assgnments.assignments1;

public class MathMain {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        Math math = new Math();
        int addTotal = math.add(num1, num2); // it is returning, it is function
        math.print(num1, num2, addTotal); // it won't return anything, but do something

        // subtract method
        int subtotal = math.subtract(num1, num2);
        math.print(num1, num2, subtotal);
    }
}
