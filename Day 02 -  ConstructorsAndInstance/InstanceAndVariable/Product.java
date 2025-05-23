package ConstructorsAndInstance.InstanceAndVariable;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product("mobile", 15000);
        Product p2 = new Product("computer", 30000);
        p1.displayProduct();
        p2.displayProduct();
        Product.displayTotalProducts();
    }
}


