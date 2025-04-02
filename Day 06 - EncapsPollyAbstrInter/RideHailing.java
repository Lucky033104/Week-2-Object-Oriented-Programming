package EncapsPollyAbstrInter;

import java.util.*;
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
abstract class Vehicle1 implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;
    public Vehicle1(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Location: " + currentLocation);
    }
    public String getCurrentLocation() {
        return currentLocation;
    }
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
    public abstract double calculateFare(double distance);
}
class Car1 extends Vehicle1 {
    public Car1(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}
class Bike1 extends Vehicle1 {
    public Bike1(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}
class Auto extends Vehicle1 {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}
public class RideHailing {
    public static void processRides(List<Vehicle1> vehicles, double distance) {
        for (Vehicle1 v : vehicles) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: ₹" + fare);
            System.out.println("-------------");
        }
    }
    public static void main(String[] args) {
        List<Vehicle1> rideList = new ArrayList<>();
        rideList.add(new Car1("CAR436", "Aathu", 15.0, "MG Road"));
        rideList.add(new Bike1("BIKE329", "Pukesh", 8.0, "City Center"));
        rideList.add(new Auto("AUTO842", "Sully", 10.0, "Metro Station"));
        double rideDistance = 10.0;
        processRides(rideList, rideDistance);
    }
}

