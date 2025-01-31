package ridehailingapp;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        // Creating a list to store vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Creating objects for each vehicle type and adding them to the list
        vehicles.add(new Car("C123", "John", 15.0));
        vehicles.add(new Car("C124", "Alice", 16.0));
        vehicles.add(new Car("C125", "Bob", 14.0));
        vehicles.add(new Car("C126", "Charlie", 18.0));
        vehicles.add(new Car("C127", "David", 17.0));
        vehicles.add(new Bike("B123", "Eve", 10.0));
        vehicles.add(new Bike("B124", "Frank", 12.0));
        vehicles.add(new Bike("B125", "Grace", 11.0));
        vehicles.add(new Bike("B126", "Hank", 13.0));
        vehicles.add(new Bike("B127", "Ivy", 9.0));

        // Processing and displaying details of each vehicle using polymorphism
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            double distance = 10.0; // Example distance in kilometers
            double fare = vehicle.calculateFare(distance);
            System.out.println("Calculated Fare for 10 Km: $" + fare);

            // Polymorphic behavior for GPS interface
            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                System.out.println(gpsVehicle.getCurrentLocation());
                gpsVehicle.updateLocation("New Location: 13.0827° N, 80.2707° E");
            }
            System.out.println();
        }
    }
}
