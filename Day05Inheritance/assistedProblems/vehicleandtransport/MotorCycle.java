package assistedProblems.vehicleandtransport;
 class MotorCycle extends Vehicle {
    
// Unique attribute for Motorcycle
private boolean hasSidecar;

// Constructor to initialize Motorcycle objects with provided values
public MotorCycle(double maxSpeed, String fuelType, boolean hasSidecar) {
    super(maxSpeed, fuelType); // Calling the superclass constructor
    this.hasSidecar = hasSidecar;
}

// Overriding the displayInfo() method to include sidecar information
@Override
public void displayDetails() {
    super.displayDetails(); // Calling the superclass method
    System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
}
}
