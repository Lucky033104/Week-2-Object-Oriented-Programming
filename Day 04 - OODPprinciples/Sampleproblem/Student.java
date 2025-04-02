package OODPprinciples.Sampleproblem;

import java.util.ArrayList;
import java.util.List;
class Subject {
    private String subjectName;
    private int marks;
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public int getMarks() {
        return marks;
    }
}
class Student {
    private int studentId;
    private String name;
    private List<Subject> subjects;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
    public List<Subject> getSubjects() {
        return subjects;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
}
class GradeCalculator {
    public String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        int total = 0;
        for (Subject s : subjects) {
            total += s.getMarks();
        }
        double avg = subjects.size() > 0 ? (double) total / subjects.size() : 0;
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}
class SchoolResultsApp {
    public static void main(String[] args) {
        Student student = new Student(101, "John");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Subjects:");
        for (Subject s : student.getSubjects()) {
            System.out.println(" - " + s.getSubjectName() + ": " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}

