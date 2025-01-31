package librarymanagementsystem;

// Creating a class Magazine to represent specific magazine items inheriting from LibraryItem (Subclass)
class Magazine extends LibraryItem implements Reservable {
    // Constructor to initialize Magazine objects with provided values
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author); // Calling the superclass constructor
    }

    // Implementing the getLoanDuration() method for magazines
    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration for magazines
    }

    // Implementing the reserveItem() method for magazines
    @Override
    public String reserveItem() {
        return ("Magazine has been reserved.");
    }

    // Implementing the checkAvailability() method for magazines
    @Override
    public boolean checkAvailability() {
        return true; // Assuming the magazine is available
    }
}
