package ClassandObject.Level1;
import java.util.Scanner;

public class mobileDetails {
    String brand;
    String model;
    double price;
    mobileDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Mobile Brand: ");
        String brand = input.nextLine();
        System.out.print("Enter Mobile Model: ");
        String model = input.nextLine();
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        mobileDetails phone = new mobileDetails(brand, model, price);
        System.out.println("\n--- Mobile Phone Details ---");
        phone.displayDetails();
        input.close();
    }
}

