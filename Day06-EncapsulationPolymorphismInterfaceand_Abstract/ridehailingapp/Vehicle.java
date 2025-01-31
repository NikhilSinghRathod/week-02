package ridehailingapp;

import java.util.ArrayList;
import java.util.List;

// Creating an abstract class Vehicle to represent generic vehicles (Superclass)
abstract class Vehicle {
    // Declaring private attributes for the Vehicle class
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor to initialize Vehicle objects with provided values
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to be implemented in subclasses to calculate fare
    public abstract double calculateFare(double distance);

    // Method to display vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Getters for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

// Creating an interface GPS with methods for GPS-related actions
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
