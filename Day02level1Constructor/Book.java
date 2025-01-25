public class Book{
   public static void main(String[] args) {
      Book b = new Book();
      b.display();
      Book b1 = new Book("William shakespeare", "Hamlet", 0280.62);
      b1.display();
      
     }

   //Attributes
   String author;
   String title;
   double price;

   //Default constructor
   Book(){
    this.author = "Unknown author";
    this.title = "Unknown title";
    this.price = 0.0;
    System.out.println("Default constructor is called ");
   }

   //parameterized constructor
   Book(String author , String title, double price){
    this.author = author;
    this.title = title;
    this.price = price;
    System.out.println("Parameterized constructor is called ");
   }

   //Displaying the results
   public void display(){
    System.out.println("The author of the book is :"+author);
    System.out.println("The title of the book is :"+title);
    System.out.println("The price of the book is :"+price);
   }
   
}