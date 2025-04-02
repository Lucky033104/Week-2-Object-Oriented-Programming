package ConstructorsAndInstance.Level1;
public class Book2 {
    String title;
    String author;
    double price;
    boolean available;
    Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("Book \"" + title + "\" is not available.");
        }
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Book2 book = new Book2("Java first edition", "S S Rajamouli", 499.0, true);
        System.out.println("Book Details:");
        book.displayDetails();
        System.out.println("\nAttempting to borrow...");
        book.borrowBook();
        System.out.println("\nBook Details After Borrowing:");
        book.displayDetails();
        System.out.println("\nAttempting to borrow again...");
        book.borrowBook();
    }
}
