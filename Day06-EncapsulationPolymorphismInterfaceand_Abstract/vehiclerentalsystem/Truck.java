package vehiclerentalsystem;

// Creating a class Truck to represent specific truck objects inheriting from Vehicle (Subclass)
class Truck extends Vehicle implements Insurable {
    // Constructor to initialize Truck objects with provided values
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate); // Calling the superclass constructor
    }

    // Implementing the calculateRentalCost() method for trucks
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implementing the calculateInsurance() method for trucks
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate as insurance
    }

    // Method to display insurance details
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance: 15% of rental rate");
    }
}
