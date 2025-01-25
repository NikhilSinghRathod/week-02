public class CarRental {
    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.display();
        System.out.println("--------------");
        CarRental c2 = new CarRental("Joseph", "Nissan", 5, 985.66);
        c2.display();
        System.out.println("--------------");
        CarRental c3 = new CarRental(c2);
        c3.display();
    }

    //Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double rent;

    //default constructor
    CarRental(){
        this.customerName = "Unknown";
        this.carModel = "Vintage";
        this.rentalDays = 1;
        this.rent = 50.58;
        System.out.println("Default constructor called");
    }
    //parameterized constructor
    CarRental(String customerName , String carModel ,int rentalDays , double rent ){
      this.customerName = customerName;
      this.carModel = carModel;
      this.rentalDays = rentalDays;
      this.rent = rent;
      System.out.println("Parameterized constructor is called");
    }
    //copy constructor
    CarRental(CarRental other){
      this.customerName = other.customerName;
      this.carModel = other.carModel;
      this.rentalDays =other. rentalDays;
      this.rent =other.rent;
      System.out.println("copy constructor called");
    }
    //get the total cost 
    public double getTotalCost(){
        return rent*rentalDays;
    }
    //Display the result
    public void display(){
        System.out.println("Name:"+customerName);
        System.out.println("Car Model :"+carModel);
        System.out.println("The days for the rent :"+rentalDays);
        System.err.println("The rent for the one day :"+rent);
        System.out.println("The total cost :"+getTotalCost());
    }
}
