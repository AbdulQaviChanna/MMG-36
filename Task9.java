
import java.util.Scanner;

public class SimpleCalculator {
    
    public static double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (add, subtract, multiply, divide): ");
        String operation = scanner.next().toLowerCase();

        double result = calculate(num1, num2, operation);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
