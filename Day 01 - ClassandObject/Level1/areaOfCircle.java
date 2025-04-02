package ClassandObject.Level1;
import java.util.Scanner;

public class areaOfCircle {
    double radius;
    areaOfCircle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double inputRadius = input.nextDouble();
        areaOfCircle circle = new areaOfCircle(inputRadius);
        circle.displayDetails();

        input.close();
    }
}

