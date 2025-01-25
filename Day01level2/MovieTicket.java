public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private int price;

    MovieTicket(){
    
    }


    //method to book ticket
    public void bookTicket(String movieName , String seatNumber , int price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    //Method to display a ticket detail
    public void displayTicket(){
     if(!movieName.isEmpty() && ! seatNumber.isEmpty()){
        System.out.println("Movie name : "+movieName);
        System.out.println("Seat number :"+seatNumber);
        System.out.println("Price of ticket :"+price);
      }else{
        System.out.println("The TICKER has not been purchased");
      }
    }
     
    public static void main(String[] args) {
        MovieTicket movie = new MovieTicket();
        movie.bookTicket("PUSHPA" , "A12", 245);
        movie.displayTicket();

 }
}