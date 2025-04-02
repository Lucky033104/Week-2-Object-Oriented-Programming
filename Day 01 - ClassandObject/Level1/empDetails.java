package ClassandObject.Level1;
public class empDetails {
    String name;
    int id;
    double salary;
    empDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
    public static void main(String[] args) {
        empDetails emp = new empDetails("John Doe", 101, 55000.00);
        emp.displayDetails();
    }
}


