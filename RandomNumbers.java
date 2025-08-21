
import java.util.Random;

public class RandomNumbers{

// Generate a random number between 1 and 100
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        number = random.nextInt(1, 101);
        System.out.print(number);
// Random heads or tails
        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}