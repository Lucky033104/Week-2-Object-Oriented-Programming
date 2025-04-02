package ClassandObject.Level1;
import java.util.Scanner;

public class trackItems {
    int itemCode;
    String itemName;
    double price;
    trackItems(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void displayDetails(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + totalCost);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        int code = input.nextInt();
        input.nextLine();
        System.out.print("Enter Item Name: ");
        String name = input.nextLine();
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();
        trackItems item = new trackItems(code, name, price);
        System.out.println("\n--- Item Details ---");
        item.displayDetails(quantity);
        input.close();
    }
}

