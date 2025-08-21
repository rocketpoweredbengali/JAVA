import java.util.Scanner;
public class Trigo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter the one side: ");
        a = scanner.nextInt();
        System.out.print("Enter the second side: ");
        b = scanner.nextInt();

        c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse is: " + c);


    }
}