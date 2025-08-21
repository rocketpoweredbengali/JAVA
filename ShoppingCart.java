import java.util.Scanner;


public class ShoppingCart {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price, total;
        char currency = '₹';
        int quantity;

        System.out.print("What item would you like to purchase?: ");
        item = scanner.nextLine();
        System.out.print("What is the price of the item?: ");
        price = scanner.nextDouble();
        System.out.print("How many of this item would you like to purchase?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have purchased " + quantity + " " + item + (quantity > 1 ? "s" : ""));
        System.out.println("The total cost is: " + currency + total);

        scanner.close();
    }
}