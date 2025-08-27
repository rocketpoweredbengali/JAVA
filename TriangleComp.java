
import java.util.Scanner;

public class TriangleComp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideA, sideB, sideC;
    

        System.out.print("Enter length of side A: ");
        sideA = scanner.nextDouble();
        System.out.print("Enter length of side B: ");
        sideB = scanner.nextDouble();
        System.out.print("Enter length of side C: ");
        sideC = scanner.nextDouble();

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("The lengths can form a triangle.");
        } else {
            System.out.println("The lengths cannot form a triangle.");
        }

        if (sideA == sideB && sideB == sideC) {
            System.out.println("The triangle is equilateral.");
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
        scanner.close();
    }
}