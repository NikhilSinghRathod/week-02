public class Vehicle {
    public static void main(String[] args) {
        Motor v1 = new Motor("James Harden", "Four Wheeler" , "MP04dg552");
        v1.displayVehicleDetails();
        System.out.println("--------------");
        Motor v2 = new Motor("Stephen Curry", "Monster Truck" , "Lster1113");
        v2.displayVehicleDetails();
        System.out.println("--------------");
        Motor v3 = new Motor("Kyrie Irving", "Bus" , "44fd3gf");
        Motor.registrationFees = 56000.65;
        v3.displayVehicleDetails();
        
    }

  }
    class Motor{
    //instance variables
    String ownerName;
    String vehicleType;
    public final String registrationNumber;

    //Class variables
    static double registrationFees = 45550.65;

    //parameterized constructor
    Motor(String ownerName , String vehicletype ,String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicletype;
        this.registrationNumber = registrationNumber;
    }

    //method for the updation of the registration fee
    public static void updateRegistrationFee(double fees){
        registrationFees =fees;
    }

    //method for the display of the vehicle details
    public void displayVehicleDetails(){
        if(this instanceof Motor){
        System.out.println("Owner Name :"+ownerName);
        System.out.println("Vehicle type :"+vehicleType);
        System.out.println("Vehicle registration fee :"+registrationFees);
        System.out.println("Registration Number :"+registrationNumber);
        }else{
            System.out.println("Not an instance");
        }
    }

    }