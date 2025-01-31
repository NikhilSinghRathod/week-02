package hybridinheritance.vehiclemanagement;

// Creating a class ElectricVehicle to represent specific ElectricVehicle objects inheriting from Vehicle
class ElectricVehicle extends Vehicle {

    // Constructor to initialize ElectricVehicle objects with provided values
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model); // Calling the superclass constructor
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle.");
    }

    // Overriding the displayDetails() method to include additional information
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.println("Type: Electric Vehicle");
    }
}
