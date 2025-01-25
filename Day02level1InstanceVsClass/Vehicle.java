public class Vehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("James Harden", "Four Wheeler");
        v1.displayVehicleDetails();
        System.out.println("--------------");
        Vehicle v2 = new Vehicle("Stephen Curry", "Monster Truck");
        v2.displayVehicleDetails();
        System.out.println("--------------");
        Vehicle v3 = new Vehicle("Kyrie Irving", "Bus");
        registrationFees = 56000.65;
        v3.displayVehicleDetails();
        
    }
    //instance variables
    String ownerName;
    String vehicleType;

    //Class variables
    static double registrationFees = 45550.65;

    //parameterized constructor
    Vehicle(String ownerName , String vehicletype){
        this.ownerName = ownerName;
        this.vehicleType = vehicletype;
    }

    //method for the updation of the registration fee
    public static void updateRegistrationFee(double fees){
        registrationFees =fees;
    }

    //method for the display of the vehicle details
    public void displayVehicleDetails(){
        System.out.println("Owner Name :"+ownerName);
        System.out.println("Vehicle type :"+vehicleType);
        System.out.println("Vehicle registration fee :"+registrationFees);
    }
}
