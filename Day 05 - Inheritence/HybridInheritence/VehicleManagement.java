package Inheritence.HybridInheritence;

interface Refuelable {
    void refuel();
}
class Vehicle {
    String model;
    int maxSpeed;
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    void charge() {
        System.out.println(model + " is charging.");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tata curv", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);
        System.out.println("Electric Vehicle:");
        ev.displayInfo();
        ev.charge();
        System.out.println("\nPetrol Vehicle:");
        pv.displayInfo();
        pv.refuel();
    }
}

