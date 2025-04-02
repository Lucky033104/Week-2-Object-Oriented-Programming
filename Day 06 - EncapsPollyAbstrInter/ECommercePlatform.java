package EncapsPollyAbstrInter;

import java.util.*;
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
abstract class Product {
    private String productId;
    private String name;
    private double price;
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public String getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }
    public abstract double calculateDiscount();
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }
    @Override
    public String getTaxDetails() {
        return "Electronics Tax (18%)";
    }
}
class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }
    @Override
    public String getTaxDetails() {
        return "Clothing Tax (5%)";
    }
}
class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Electronics("E254", "Laptop", 75000));
        productList.add(new Clothing("C232", "T-Shirt", 1200));
        productList.add(new Groceries("G258", "Rice Bag", 900));
        for (Product p : productList) {
            p.displayDetails();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;
            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            } else {
                System.out.println("No Tax");
            }
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("------------");
        }
    }
}

