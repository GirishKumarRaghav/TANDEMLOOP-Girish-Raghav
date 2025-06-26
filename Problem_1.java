import java.util.Scanner;

class Calculator {
    double a, b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(String operation) {
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
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add/sub/mul/div): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b);
        System.out.println("Result: " + calc.calculate(op));
    }
}
