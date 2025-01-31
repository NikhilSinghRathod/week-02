package librarymanagementsystem;

abstract class LibraryItem {
     // Declaring private attributes for the LibraryItem class
     private String itemId;
     private String title;
     private String author;
 
     // Constructor to initialize LibraryItem objects with provided values
     public LibraryItem(String itemId, String title, String author) {
         this.itemId = itemId;
         this.title = title;
         this.author = author;
     }
 
     // Abstract method to be implemented in subclasses to get loan duration
     public abstract int getLoanDuration();
 
     // Method to display item details
     public void getItemDetails() {
         System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author);
     }
 
     // Getter and setter methods for encapsulation
     public String getItemId() {
         return itemId;
     }
 
     public void setItemId(String itemId) {
         this.itemId = itemId;
     }
 
     public String getTitle() {
         return title;
     }
 
     public void setTitle(String title) {
         this.title = title;
     }
 
     public String getAuthor() {
         return author;
     }
 
     public void setAuthor(String author) {
         this.author = author;
     }
 }
 
 // Creating an interface Reservable with methods for reservation-related actions
 interface Reservable {
     String reserveItem();
     boolean checkAvailability();
 }
 

