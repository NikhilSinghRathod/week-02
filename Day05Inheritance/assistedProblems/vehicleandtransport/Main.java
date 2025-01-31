package assistedProblems.vehicleandtransport;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(195.68, "Petrol", 6);
        Vehicle truck = new Truck(100, "Diesel", 95);
        Vehicle motorcycle = new MotorCycle(180, "Power oil", true);
        
        // Storing objects of different subclasses in an array of Vehicle type
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Demonstrating polymorphism by calling displayInfo() on each object
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("--------------");
        }
    }
}
