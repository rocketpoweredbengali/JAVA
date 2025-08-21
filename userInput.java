import java.util.Scanner;


public class userInput {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What is your name? ");
            String name = scanner.nextLine();
            System.out.print("What is your age? ");
            int age = scanner.nextInt();
            System.out.print("What is your cgpa? ");
            double cgpa = scanner.nextDouble();
            System.out.print("Are you a student? (true/false)");
            boolean isStudent = scanner.nextBoolean();
            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");
            System.out.println("Your cgpa is " + cgpa + ".");
            if (isStudent){
                System.out.println("You are a student.");
            }else{
                System.out.println("You are not a student.");
            }
        }
    }
}

