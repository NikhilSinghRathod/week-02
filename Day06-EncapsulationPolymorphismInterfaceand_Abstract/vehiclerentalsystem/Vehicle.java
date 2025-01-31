package vehiclerentalsystem;
import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    // Declaring private attributes for the Vehicle class
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor to initialize Vehicle objects with provided values
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to be implemented in subclasses to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: " + rentalRate);
    }

    // Getter and setter methods for encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

// Creating an interface Insurable with methods for insurance-related actions
interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

