package librarymanagementsystem;

// Creating a class DVD to represent specific DVD items inheriting from LibraryItem (Subclass)
class DVD extends LibraryItem implements Reservable {
    // Constructor to initialize DVD objects with provided values
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author); // Calling the superclass constructor
    }

    // Implementing the getLoanDuration() method for DVDs
    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration for DVDs
    }

    // Implementing the reserveItem() method for DVDs
    @Override
    public String reserveItem() {
        return "DVD has been reserved.";
    }

    // Implementing the checkAvailability() method for DVDs
    @Override
    public boolean checkAvailability() {
        return true; // Assuming the DVD is available
    }
}

