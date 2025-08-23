import java.util.Scanner;

public class APC {

    public static void main(String[] args) {
        // Area and Perimeter Calculator
        Scanner scanner = new Scanner(System.in);
        double area, perimeter;
        System.out.println("----Area and Perimeter Calculator----");
        System.out.println("Enter the shape: ");
        System.out.println("1. Square ");
        System.out.println("2. Rectangle ");
        System.out.println("3. Circle ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                if (side <= 0) {
                    System.out.println("Error: Side length must be a positive number.");
                    return;
                }
                area = side * side;
                perimeter = 4 * side;
                System.out.printf("Area of the square: %.2f cm²\n", area);
                System.out.printf("Perimeter of the square: %.2f cm\n", perimeter);
            }
            case 2 -> {
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                if (length <= 0 || width <= 0) {
                    System.out.println("Error: Length and width must be positive numbers.");
                    return;
                }
                area = length * width;
                perimeter = 2 * (length + width);
                System.out.printf("Area of the rectangle: %.2f cm²\n", area);
                System.out.printf("Perimeter of the rectangle: %.2f cm\n", perimeter);
            }
            case 3 -> {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                if (radius <= 0) {
                    System.out.println("Error: Radius must be a positive number.");
                    return;
                }
                area = Math.PI * radius * radius;
                perimeter = 2 * Math.PI * radius;
                System.out.printf("Area of the circle: %.2f cm²\n", area);
                System.out.printf("Circumference of the circle: %.2f cm\n", perimeter);
            }
            default ->
                System.out.println("Invalid choice. Please select 1-3.");
        }
    }
}