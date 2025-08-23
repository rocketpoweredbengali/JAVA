
import java.util.Scanner;

public class LargestVariable {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a, b, c;
       System.out.print("Enter the first number: ");
       a = scanner.nextInt();
       System.out.print("Enter the second number: ");
       b = scanner.nextInt();
       System.out.print("Enter the third number: ");
       c = scanner.nextInt();
       if (a >= b && a >= c)
       System.out.println("The Largest number is: " + a);
       else if (b >= c && b >= a)
       System.out.println("The Largest number is: " + b);
       else
       System.out.println("The Largest number is: " + c);
       scanner.close();
       
    }
}