package Static;

public class Patient {
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    static String hospitalName = "Apollo Hospitals";
    private static int totalPatients = 0;
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
        else {
            System.out.println("Invalid object. Not a Patient.");
        }
    }
    public static void main(String[] args) {
        Patient p1 = new Patient("1", "Lucky", 24, "Fever");
        Patient p2 = new Patient("2", "Bhaskar", 30, "Stomach pain");
        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();
        getTotalPatients();
    }
}

