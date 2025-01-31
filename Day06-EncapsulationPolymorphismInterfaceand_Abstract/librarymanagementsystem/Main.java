package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list to store library items
        List<LibraryItem> items = new ArrayList<>();

        // Creating objects for each item type and adding them to the list
        items.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Book("B002", "To Kill a Mockingbird", "Harper Lee"));
        items.add(new Book("B003", "1984", "George Orwell"));
        items.add(new Book("B004", "The Catcher in the Rye", "J.D. Salinger"));
        items.add(new Book("B005", "Pride and Prejudice", "Jane Austen"));
        items.add(new Magazine("M001", "National Geographic", "Various Authors"));
        items.add(new Magazine("M002", "Time", "Various Authors"));
        items.add(new DVD("D001", "Inception", "Christopher Nolan"));
        items.add(new DVD("D002", "The Godfather", "Francis Ford Coppola"));
        items.add(new DVD("D003", "The Dark Knight", "Christopher Nolan"));

        // Processing and displaying details of each item using polymorphism
        for (LibraryItem item : items) {
            item.getItemDetails();
            int loanDuration = item.getLoanDuration();
            System.out.println("Loan Duration: " + loanDuration + " days");
            
            boolean isAvailable = ((Reservable) item).checkAvailability();
            System.out.println("Availability: " + (isAvailable ? ("Available\n"+((Reservable) item).reserveItem()) : ("Not Available")));
            System.out.println();
        }
    }
}
