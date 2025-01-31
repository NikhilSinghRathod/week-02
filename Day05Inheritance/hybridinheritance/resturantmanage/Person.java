package hybridinheritance.resturantmanage;

// Creating a superclass Person to represent generic persons
class Person {
    // Declaring protected attributes for the Person class
    protected String name;
    protected int id;

    // Constructor to initialize Person objects with provided values
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.printf("Name: %s, ID: %d%n", name, id);
    }
}

// Creating an interface Worker to define the duties of workers
interface Worker {
    // Abstract method to be implemented by subclasses
    void performDuties();
}
