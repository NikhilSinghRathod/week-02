package ridehailingapp;

// Creating a class Car to represent specific car cases inheriting from Vehicle (Subclass)
class Car extends Vehicle implements GPS {
    // Constructor to initialize Car objects with provided values
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implementing the calculateFare() method for cars
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implementing the getCurrentLocation() method for cars
    @Override
    public String getCurrentLocation() {
        return "Car current location is GPS Coordinates: 12.9716° N, 77.5946° E";
    }

    // Implementing the updateLocation() method for cars
    @Override
    public void updateLocation(String location) {
        System.out.println("Car location updated to: " + location);
    }
}
