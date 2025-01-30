import java.util.ArrayList;
import java.util.List;

class Book{
 //Attributes
 private String title;
 private String author;

 //Parameterized constructor
 public Book(String title , String author){
   this.title = title;
   this.author = author;
 }
 //method to get title;
 public String getTitle(){
    return title;
 }
 //method to set author
 public String getAuthor(){
    return author;
 }
 //display book details
 public void display(){
    System.out.println("Title :"+title +" ,Author :"+author);
 }
}
  class Library{
    private String libraryName;
    private List<Book> books;

    //parameterized constructor
    public Library(String libraryName ){
      this.libraryName = libraryName;
      this.books= new ArrayList<>();
    }
   //Add book to list
    public void addbook(Book book){
        books.add(book);
    }

    //display library
    public void displayLibrary(){
        System.out.println("Library Name :"+libraryName);
        for(Book book : books){
            book.display();
        }
    }
}
  public class LibraryManagement{
     public static void main(String[] args) {
      Book b1 = new Book("Harper", "George");
      Book b2 = new Book("All the Kings Men", "Robert penn");
      Book b3 = new Book("National", "Rabindra");

      Library l1 = new Library("Central Library");
      Library l2 = new Library("Government");

      l1.addbook(b1);
      l2.addbook(b2);
      l1.addbook(b3);

      l1.displayLibrary();
      l2.displayLibrary();

     }
  }