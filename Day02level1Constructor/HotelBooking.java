public class HotelBooking{
   public static void main(String[] args) {
    HotelBooking h = new HotelBooking();
    h.display();
    System.out.println("------------------");
    HotelBooking h2 = new HotelBooking("Modi","Ac",5);
    h2.display();
    System.out.println("------------------");
    HotelBooking h3 = new HotelBooking(h2);
    h3.display();

   }
   //Attributes
   String guestName;
   String roomType;
   int nights ;
   // Default constructor
   HotelBooking(){
    this.guestName = "Joe biden";
    this.roomType = "Non ac";
    this.nights = 2;
   }
   //parameterized constructor
   HotelBooking(String guestName ,String roomType , int nights){
     this.guestName = guestName;
     this.roomType = roomType;
     this.nights = nights;
   }
   //copy constructor
   HotelBooking(HotelBooking other){
    this.guestName = other.guestName;
    this.roomType = other.roomType;
    this.nights = other.nights;
   }
   //Display guest details
   public void display(){
    System.out.println("Guest name :"+guestName);
    System.out.println("Room type :"+roomType);
    System.out.println("Nights Spend :"+nights);
   }

}