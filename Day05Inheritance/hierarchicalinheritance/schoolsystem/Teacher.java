package hierarchicalinheritance.schoolsystem;

// Creating a class Teacher to represent specific Teacher objects inheriting from Person (Subclass)
class Teacher extends Person {
    // Unique attribute for Teacher
    private String subject;

    // Constructor to initialize Teacher objects with provided values
    public Teacher(String name, int age, String subject) {
        super(name, age); // Calling the superclass constructor
        this.subject = subject;
    }

    // Overriding the displayRole() method to specify the role
    @Override
    public void displayRole() {
        System.out.println("Teacher");
    }

    // Method to display teacher details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.printf("Subject: %s%n", subject);
    }
}
