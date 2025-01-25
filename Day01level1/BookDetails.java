import java.util.Scanner;
public class BookDetails {
    private String title ;
    private String author;
    double price;

    //creating the constructor
    BookDetails(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price= price;
    }
   //printing the result 
    public void display(){
        System.out.println("The title of the book is : "+title);
        System.out.println("The author of the book is :"+author);
        System.out.println("The price of the book is :"+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the book");
        String title = sc.nextLine();

        System.out.println("Enter the author of the book");
        String author = sc.nextLine();

        System.out.println("Enter the price of the book");
        int price = sc.nextInt();

        BookDetails book = new BookDetails(title, author, price);

        book.display();

        sc.close();
      }
}
