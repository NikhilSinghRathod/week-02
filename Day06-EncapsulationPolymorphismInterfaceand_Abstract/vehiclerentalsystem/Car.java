package vehiclerentalsystem;

// Creating a class Car to represent specific car objects inheriting from Vehicle (Subclass)
class Car extends Vehicle implements Insurable {
    // Constructor to initialize Car objects with provided values
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate); // Calling the superclass constructor
    }

    // Implementing the calculateRentalCost() method for cars
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implementing the calculateInsurance() method for cars
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% of rental rate as insurance
    }

    // Method to display insurance details
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance: 10% of rental rate");
    }
}

