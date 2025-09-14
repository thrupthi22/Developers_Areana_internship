public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // causes ArithmeticException
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}
