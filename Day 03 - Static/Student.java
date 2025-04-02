package Static;

public class Student {
    private final int rollNumber;
    private String name;
    private String grade;
    static String universityName = "SRM Institute of Science & Technology";
    private static int totalStudents = 0;
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Enrolled Students: " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid");
        }
    }
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        }
        else {
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vamshi", "A");
        Student s2 = new Student(102, "Bhaskar", "A+");
        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();
        s2.updateGrade("A-");
        System.out.println();
        Student.displayTotalStudents();
    }
}
