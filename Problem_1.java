import java.util.Scanner;

public class Problem_1 {
    static class Calculator {
        double a, b;
        Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        double operate(String operation) {
            switch (operation.toLowerCase()) {
                case "add":
                    return a + b;
                case "sub":
                    return a - b;
                case "mul":
                    return a * b;
                case "div":
                    if (b != 0) return a / b;
                    else {
                        System.out.println("Cannot divide by zero!");
                        return 0;
                    }
                default:
                    System.out.println("Invalid operation");
                    return 0;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b);
        double result = calc.operate(operation);

        System.out.println("Result: " + result);
    }
}
