package hybridinheritance.vehiclemanagement;

// Creating a class PetrolVehicle to represent specific PetrolVehicle objects inheriting from Vehicle and implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {

    // Constructor to initialize PetrolVehicle objects with provided values
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model); // Calling the superclass constructor
    }

    // Overriding the refuel() method to specify the refueling behavior
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle.");
    }

    // Overriding the displayDetails() method to include additional information
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.println("Type: Petrol Vehicle");
    }
}
