package vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list to store vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Creating objects for each vehicle type and adding them to the list
        vehicles.add(new Car("C001", "Car", 500));
        vehicles.add(new Bike("B001", "Bike", 200));
        vehicles.add(new Truck("T001", "Truck", 1000));
        vehicles.add(new Car("C002", "Car", 550));
        vehicles.add(new Bike("B002", "Bike", 220));
        vehicles.add(new Truck("T002", "Truck", 1100));

        // Processing and displaying details of each vehicle using polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(5); // Assuming rental for 5 days
            double insuranceCost = ((Insurable) vehicle).calculateInsurance();
            double finalCost = rentalCost + insuranceCost;
            System.out.println("Rental Cost for 5 days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Final Cost: " + finalCost);
            System.out.println();
        }
    }
}
