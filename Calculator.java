public class calculatorUsingMethods {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if(b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double)a / b;
    }
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }

}