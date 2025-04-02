package Inheritence.AssistedProblems;

class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    int internshipDuration; // in months
    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Akash", 100, 908700, 10);
        Developer developer = new Developer("Harish", 109, 75000, "Java");
        Intern intern = new Intern("Dinesh", 103, 20000, 6);
        System.out.println("--- Manager Details ---");
        manager.displayDetails();
        System.out.println("\n--- Developer Details ---");
        developer.displayDetails();
        System.out.println("\n--- Intern Details ---");
        intern.displayDetails();
    }
}