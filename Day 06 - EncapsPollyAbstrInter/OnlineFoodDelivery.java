package EncapsPollyAbstrInter;

interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    public abstract double calculateTotalPrice();
}
class VegItem extends FoodItem implements Discountable {
    private static final double VEG_DISCOUNT = 0.10; // 10% discount on veg items
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        double totalPrice = getPrice() * getQuantity();
        return totalPrice - (totalPrice * VEG_DISCOUNT); // Applying discount for Veg items
    }
    @Override
    public void applyDiscount() {
        System.out.println("Applying 10% discount on Veg Item: " + getItemName());
    }
    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg items";
    }
}
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 2.50;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        double totalPrice = getPrice() * getQuantity();
        return totalPrice + NON_VEG_CHARGE; // Adding extra charge for Non-Veg items
    }
    @Override
    public void applyDiscount() {
        System.out.println("No discount available for Non-Veg Item: " + getItemName());
    }
    @Override
    public String getDiscountDetails() {
        return "No discount available for Non-Veg items";
    }
}
public class OnlineFoodDelivery {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Burger", 5.00, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 6.00, 1);
        FoodItem[] foodItems = {vegItem, nonVegItem};
        double totalOrderPrice = 0;
        for (FoodItem item : foodItems) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount();
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("------------");
            totalOrderPrice += item.calculateTotalPrice();
        }
        System.out.println("Total Order Price: " + totalOrderPrice);
    }
}

