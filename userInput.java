import java.util.Scanner;


public class userInput {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = scanner.nextLine();
            System.out.print("What is your age? ");
            int age = scanner.nextInt();
            System.out.println("What is your CGPA? ");
            double cgpa = scanner.nextDouble();
            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");
            System.out.println("Your CGPA is " + cgpa + ".");
        }
    }
}

