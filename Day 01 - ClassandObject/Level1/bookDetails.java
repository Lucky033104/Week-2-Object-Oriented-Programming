package ClassandObject.Level1;
import java.util.Scanner;

public class bookDetails {
    String title;
    String author;
    double price;
    bookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = input.nextLine();
        System.out.print("Enter Author Name: ");
        String author = input.nextLine();
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        bookDetails book = new bookDetails(title, author, price);
        System.out.println("\n--- Book Details ---");
        book.displayDetails();
        input.close();
    }
}

