package assistedProblems.vehicleandtransport;

 class Truck extends Vehicle {
    //Unique attributes
    private int loadingCapacity;

    // Constructor to initialize Vehicle objects with provided values
    public Truck(double maxSpeed , String fuelType , int loadingCapacity){
       super(maxSpeed,fuelType);
       this.loadingCapacity = loadingCapacity;
    }

     // Overriding the displayInfo() method to include seat capacity information
   @Override
   public void displayDetails(){
    super.displayDetails();
    System.out.println("Loading capacity : "+loadingCapacity + " kg");
   }
    
}
