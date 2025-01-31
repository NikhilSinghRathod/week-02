package singleinheritance.librarymanagement;

public class Main {
    public static void main(String[] args) {
         // Creating Author objects
         Author author1 = new Author(" Whispers of the Wind",2018,"Emity carter",
         "/nNational Book Award, Best Fiction of the Year",45);
         Author author2 = new Author("The Silent Echo", 2021, "Daniel wright",
          "/nBest fiction awards", 30);
         // Displaying details of the books and their authors
         author1.displayInfo();
         System.out.println("-----------------------");
         author2.displayInfo();
         
    }
}
