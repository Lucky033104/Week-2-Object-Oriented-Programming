package Static;

public class Vehicle {
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    static double registrationFee = 2500.0;
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to ₹" + registrationFee);
    }
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
        else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("TN01AB1234", "Lucky", "Car");
        Vehicle v2 = new Vehicle("TS07XY5678", "Bhaskar", "Bike");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();
        Vehicle.updateRegistrationFee(3000.0);
        System.out.println();
        v1.displayVehicleDetails();
    }
}

