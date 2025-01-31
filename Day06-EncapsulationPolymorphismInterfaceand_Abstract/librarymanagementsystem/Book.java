package librarymanagementsystem;

// Creating a class Book to represent specific book items inheriting from LibraryItem (Subclass)
class Book extends LibraryItem implements Reservable {
    // Constructor to initialize Book objects with provided values
    public Book(String itemId, String title, String author) {
        super(itemId, title, author); // Calling the superclass constructor
    }

    // Implementing the getLoanDuration() method for books
    @Override
    public int getLoanDuration() {
        return 21; // 21 days loan duration for books
    }

    // Implementing the reserveItem() method for books
    @Override
    public String reserveItem() {
        return ("Book has been reserved.");
    }

    // Implementing the checkAvailability() method for books
    @Override
    public boolean checkAvailability() {
        return true; // Assuming the book is available
    }
}
