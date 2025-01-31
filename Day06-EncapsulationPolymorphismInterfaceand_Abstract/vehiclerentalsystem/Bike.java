package vehiclerentalsystem;

// Creating a class Bike to represent specific bike objects inheriting from Vehicle (Subclass)
class Bike extends Vehicle implements Insurable {
    // Constructor to initialize Bike objects with provided values
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate); // Calling the superclass constructor
    }

    // Implementing the calculateRentalCost() method for bikes
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implementing the calculateInsurance() method for bikes
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate as insurance
    }

    // Method to display insurance details
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance: 5% of rental rate");
    }
}

