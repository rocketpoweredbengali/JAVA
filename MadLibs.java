import java.util.Scanner;

public class MadLibs {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        String verb1 = scanner.nextLine();
        System.out.print("Enter an emotion (adjective): ");
        String emotion = scanner.nextLine();


        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + adjective2 + " " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + verb1 + "ing around and looked very " + emotion + ".");
        System.out.println("I felt " + emotion + " watching it!");

        scanner.close();
    }
}