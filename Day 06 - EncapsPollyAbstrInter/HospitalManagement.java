package EncapsPollyAbstrInter;

import java.util.ArrayList;
import java.util.List;
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}
abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory = new ArrayList<>();
    private String diagnosis;
    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }
    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalHistory);
    }
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }
    public abstract double calculateBill();
}
class InPatient extends Patient {
    private int numberOfDays;
    private double dailyRate;
    public InPatient(int patientId, String name, int age, String diagnosis, int numberOfDays, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }
    @Override
    public double calculateBill() {
        return numberOfDays * dailyRate;
    }
}
class OutPatient extends Patient {
    private double consultationFee;
    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(185, "Arush", 49, "Pneumonia", 5, 1500.0);
        Patient p2 = new OutPatient(129, "Kiran", 30, "Fever", 500.0);
        p1.addRecord("Admitted to ward A");
        p1.addRecord("IV antibiotics started");
        p2.addRecord("Visited ICU on 12-Apr");
        p2.addRecord("Paracetamol prescribed");
        Patient[] patients = {p1, p2};
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Medical Records: " + p.viewRecords());
            System.out.println("Total Bill: ₹" + p.calculateBill());
            System.out.println("---------------");
        }
    }
}

