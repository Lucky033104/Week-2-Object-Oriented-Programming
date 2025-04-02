package ConstructorsAndInstance.Level1;
public class Circle {
    double radius;
    Circle() {
        this(1.0);
    }
    Circle(double radius) {
        this.radius = radius;
    }
    void displayResults() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }
    public static void main(String[] args) {
        System.out.println("Circle (def):");
        Circle circ1 = new Circle();
        circ1.displayResults();
        System.out.println("\nCircle (parameter):");
        Circle circle2 = new Circle(4.5);
        circle2.displayResults();
    }
}

