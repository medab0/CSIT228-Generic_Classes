import Arithmetic.Arithmetic;

public class Main {
    public static void main(String[] args) {
        // Testing Arithmetic
        Arithmetic arithmetic = new Arithmetic(10, 5.5);
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Min: " + arithmetic.getMin());
        System.out.println("Max: " + arithmetic.getMax());

    }
}
