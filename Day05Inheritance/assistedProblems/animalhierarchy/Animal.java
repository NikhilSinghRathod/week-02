package assistedProblems.animalhierarchy;
class Animal{
    //Attributes 
    protected String name;
    protected int age;

    // Constructor to initialize Animal objects with provided values
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to make sound
    public void makeSound(){
        System.out.println("Animals makes a sound");
    }
    //method to display details
    public void displayDetails(){
        System.out.println("Name : "+name + " age :"+age);
    }
}