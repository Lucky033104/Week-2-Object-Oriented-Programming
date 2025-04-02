package EncapsPollyAbstrInter;

import java.util.*;
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double monthlyBonus;
    public FullTimeEmployee(String employeeId, String name, double baseSalary, double monthlyBonus) {
        super(employeeId, name, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyBonus;
    }
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Full-Time Department: " + department;
    }
}
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Part-Time Department: " + department;
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee emp1 = new FullTimeEmployee("FT987", "Ravi", 50000, 7000);
        emp1.assignDepartment("Engineering");
        PartTimeEmployee emp2 = new PartTimeEmployee("PT6309", "Jayesh", 300, 20);
        emp2.assignDepartment("Support");
        employees.add(emp1);
        employees.add(emp2);
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("------------");
        }
    }
}

