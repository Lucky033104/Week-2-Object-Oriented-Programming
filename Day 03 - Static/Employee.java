package Static;

public class Employee {
    private final int id;
    private String name;
    private String designation;
    static String companyName = "TechVerse Pvt Ltd";
    private static int totalEmployees = 0;
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
        else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ramesh", "Software Engineer");
        Employee e2 = new Employee(102, "Ramu", "UI/UX Designer");
        e1.displayEmployeeDetails();
        System.out.println();
        e2.displayEmployeeDetails();
        System.out.println();
        Employee.displayTotalEmployees();
    }
}

