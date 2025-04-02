package ClassandObject.Level2;
import java.util.ArrayList;
import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalPrice() {
        return price * quantity;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = input.nextLine();
                    System.out.print("Enter Price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = input.nextInt();
                    cart.add(new CartItem(name, price, qty));
                    System.out.println("Item added to cart.");
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = input.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).itemName.equalsIgnoreCase(removeName)) {
                            cart.remove(i);
                            removed = true;
                            System.out.println("Item removed.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Item not found.");
                    }
                    break;
                case 3:
                    double total = 0;
                    System.out.println("\nItems in Cart:");
                    for (CartItem item : cart) {
                        System.out.println(item.itemName + " - ₹" + item.price + " x " + item.quantity);
                        total += item.getTotalPrice();
                    }
                    System.out.println("Total Cost: ₹" + total);
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        input.close();
    }
}

