package assistedProblems.vehicleandtransport;

public class Vehicle {
    //Attributes
    protected double maxSpeed;
    protected String fuelType;

    // Constructor to initialize Vehicle objects with provided values
    public Vehicle(double maxSpeed ,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information, to be overridden in subclasses if needed
    public void displayDetails(){
        System.out.println("Max speed : "+maxSpeed);
        System.out.println("Fuel Type : "+fuelType);
    }
}
