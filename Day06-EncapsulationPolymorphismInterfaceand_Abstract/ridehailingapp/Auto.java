package ridehailingapp;

// Creating a class Auto to represent specific auto cases inheriting from Vehicle (Subclass)
class Auto extends Vehicle implements GPS {
    // Constructor to initialize Auto objects with provided values
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implementing the calculateFare() method for autos
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implementing the getCurrentLocation() method for autos
    @Override
    public String getCurrentLocation() {
        return "Auto current location is GPS Coordinates: 12.9716° N, 77.5946° E";
    }

    // Implementing the updateLocation() method for autos
    @Override
    public void updateLocation(String location) {
        System.out.println("Auto location updated to: " + location);
    }
}
