package singleinheritance.librarymanagement;

class Book {
    //Attributes 
    protected String title;
    protected int publicationYear;

    //Constructor to initialize Book objects with provided values
    public Book(String title , int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //method to display the information of the author
    public void displayInfo(){
        System.out.println("Title of the book : "+title);
        System.out.println("Publication year  : "+publicationYear);
    }
}
