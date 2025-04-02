package ConstructorsAndInstance.InstanceAndVariable;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000; // Default fee for all vehicles

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(6500);
        Vehicle v1 = new Vehicle("Vamshi", "Car");
        Vehicle v2 = new Vehicle("Lucky", "Bike");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}

