package ConstructorsAndInstance.AccessModifiers;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}
class Manager extends Employee {
    private int teamSize;
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }
    public void displayManagerDetails() {
        System.out.println("Manager ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (private via getter): ₹" + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
    public static void main(String[] args) {
        Manager managrr = new Manager(101, "IT", 75000.0, 8);
        managrr.displayEmployeeDetails();
        System.out.println();
        managrr.displayManagerDetails();
    }
}
