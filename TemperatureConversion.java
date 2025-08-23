import java.util.Scanner;

public class TemperatureConversion {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Which conversion would you like to perform?");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9.0/5.0) + 32;
                System.out.printf("%.2f°C is equal to %.2f°F\n", celsius, fahrenheit);
            }
            case 2 -> {
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5.0/9.0;
                System.out.printf("%.2f°F is equal to %.2f°C\n", fahrenheit, celsius);
            }
            default -> System.out.println("Invalid choice. Please select 1 or 2.");
        }
        scanner.close();
    }
}