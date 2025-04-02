package ClassandObject.Level2;
import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    double marks;
    Student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = input.nextInt();
        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();
        Student student = new Student(name, rollNumber, marks);
        System.out.println("\n--- Student Report ---");
        student.displayDetails();
        input.close();
    }
}
