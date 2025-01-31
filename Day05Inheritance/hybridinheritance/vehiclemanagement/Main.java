package hybridinheritance.vehiclemanagement;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        ElectricVehicle electricVehicle = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle petrolVehicle = new PetrolVehicle(180, "Ford Mustang");

        // Displaying vehicle details and demonstrating unique behaviors
        electricVehicle.displayDetails();
        electricVehicle.charge();
        System.out.println();

        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
