
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        double result;
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                result = a + b;
                System.out.println("Result: " + result);
            }
            case 2 -> {
                result = a - b;
                System.out.println("Result: " + result);
            }
            case 3 -> {
                result = a * b;
                System.out.println("Result: " + result);
            }
            case 4 -> {
                if (b != 0) {
                    result = (double) a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            default ->
                System.out.println("Invalid choice. Please select 1-4.");
        }
    }
}
