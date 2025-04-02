package Static;

public class Product {
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    static double discount = 10.0;
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Not a Product");
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product("1", "Laptop", 55000.0, 1);
        Product p2 = new Product("2", "Mouse", 1200.0, 2);
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        Product.updateDiscount(15.0);
        System.out.println();
        p1.displayProductDetails();
    }
}
