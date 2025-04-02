package ConstructorsAndInstance.Level1;
public class Book {
    String title;
    String author;
    double amount;
    Book() {
        title = "Unknown";
        author = "Unknown";
        amount = 0.0;
    }
    Book(String title, String author, double amount) {
        this.title = title;
        this.author = author;
        this.amount = amount;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + amount);
    }
    public static void main(String[] args) {
        System.out.println("Default Book:");
        Book defaultBook = new Book();
        defaultBook.displayDetails();
        System.out.println("\nCustom Book:");
        Book customBook = new Book("Java first edition", "S.S Rajamouli", 999.0);
        customBook.displayDetails();
    }
}
