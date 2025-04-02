package ConstructorsAndInstance.InstanceAndVariable;

public class Course {
    private String courseName;
    private double duration;
    private int fee;
    private static String institutionName;
    Course(String courseName, double duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute Name: " + institutionName);
    }
    public static void updateInstituteName(String newName) {
        institutionName = newName;
    }
    public static void main(String[] args) {
        Course.updateInstituteName("BridgeLabz");
        Course c1 = new Course("Java Programming", 12, 5000);
        Course c2 = new Course("Web Development", 10, 4500);
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}

