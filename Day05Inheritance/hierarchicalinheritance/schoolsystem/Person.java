package hierarchicalinheritance.schoolsystem;

// Creating a class Person to represent generic persons (Superclass)
class Person {
    // Declaring protected attributes for the Person class
    protected String name;
    protected int age;

    // Constructor to initialize Person objects with provided values
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.printf("Name: %s, Age: %d%n", name, age);
    }

    // Method to be overridden in subclasses to specify the role
    public void displayRole() {
        System.out.println("Person");
    }
}
