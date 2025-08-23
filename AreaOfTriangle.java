import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, height;
        double area;
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextInt();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextInt();
        area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area + " cm²");
        scanner.close();
    }
}