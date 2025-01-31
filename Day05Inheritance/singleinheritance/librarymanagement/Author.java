package singleinheritance.librarymanagement;

class Author extends Book {
    //unique attributes
    private String name;
    private String awards;
    private int age;

    //Constructor to initialize car objects with provided values
    public Author(String title , int publicationYear , String name , String awards , int age){
        super(title, publicationYear);
        this.name = name;
        this.awards = awards ;
        this.age = age;
    }

    //method to display the information of the author
    @Override
    public void displayInfo(){
     super.displayInfo();
     System.out.println("Name of the author :"+name);
     System.out.println("Awards :"+awards);
     System.out.println("Age of the author :"+age);
    }
}
