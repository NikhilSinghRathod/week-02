package assistedProblems.vehicleandtransport;

class Car extends Vehicle{
    //unique attributes
   private int seatCapacity;

   // Constructor to initialize car objects with provided values
   public Car(double maxSpeed , String fuelType , int seatCapacity){
    super(maxSpeed, fuelType);
    this.seatCapacity = seatCapacity;
   }

   // Overriding the displayInfo() method to include seat capacity information
   @Override
   public void displayDetails(){
       super.displayDetails(); // Calling the superclass method
       System.out.println("Seat Capacity: " + seatCapacity);
   }
}