class Book{
    //Static variable shared across all where
    public static String libraryName;
     // Public member (accessible from anywhere)
    public String ISBN;

    // Protected member (accessible within the same package and subclasses)
    protected String title;

    // Private member (accessible only within this class)
    private String author ;

    // Constructor to initialize Book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    // Public setter to modify the private author attribute
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter to retrieve the private author attribute
    public String getAuthor() {
        return author;
    }
     // Method to display book details
     public void displayBookDetails() {
        if(this instanceof Book){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        }else{
            System.out.println("Not an instance");
        }
    }
}
// Subclass EBook demonstrating access to public and protected members
class EBook extends Book {
    private double fileSizeMB;

    // Constructor for EBook, using the super keyword to call parent constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("\nE-Book Details:");
        System.out.println("ISBN: " + ISBN);  // Public member (accessible)
        System.out.println("Title: " + title); // Protected member (accessible within subclass)
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("Author (via method): " + getAuthor()); // Accessing private author using getter
    }
}
public class LibraryManage {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        book1.displayBookDetails();

        // Modifying the author name using setter
        book1.setAuthor("J. Bloch");
        System.out.println("\nAfter updating author:");
        book1.displayBookDetails();

        System.out.println("\n----------------------------");

        Book b1 = new EBook(null, null, null, 0);
        if(b1 instanceof EBook){
            System.out.println("b1 is an instance of Ebook");
        }
        if (b1 instanceof Book) {
            System.out.println("b1 is an instance of Book also");
        }
    }
}
