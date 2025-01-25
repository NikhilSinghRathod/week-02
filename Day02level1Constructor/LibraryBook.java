public class LibraryBook {
    public static void main(String[] args) {
        // LibraryBook b = new LibraryBook();
        // b.display();
        LibraryBook b2 = new LibraryBook("Halmet", "William Shakespeare", 520.6, true);
        b2.display();
        System.out.println("--------------");
        b2.borrowBook();
        System.out.println("--------------");
        b2.borrowBook();


    }
    //Attributes
    String title;
    String author;
    double price;
    boolean availability;
    //default constructor;
    // LibraryBook(){
    //     this.title="Hamlet";
    //     this.author="William Shakespeare";
    //     this.price=250.26;
    //     this.availability = true;
    // }
    //parameterized constructor
    LibraryBook(String title, String author,double price,boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability = availability ;
    }
    //method for borrow availability
     public void borrowBook(){
        if(availability){
            availability = false;
            System.out.println("The book is available");
        }
        else{
            System.out.println("The book is not available");
        }
     }

    public void display(){
        System.out.println("The name of book :"+title);
        System.out.println("The author of the book is :"+author);
        System.out.println("The price of the book is :"+price);
        if(availability == true){
            System.out.println("The book is available");
        }else{
            System.out.println("The book is not available");
        }
    }
}
