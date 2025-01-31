package hierarchicalinheritance.schoolsystem;

// Creating a class Staff to represent specific Staff objects inheriting from Person (Subclass)
class Staff extends Person {
    // Unique attribute for Staff
    private String jobTitle;

    // Constructor to initialize Staff objects with provided values
    public Staff(String name, int age, String jobTitle) {
        super(name, age); // Calling the superclass constructor
        this.jobTitle = jobTitle;
    }

    // Overriding the displayRole() method to specify the role
    @Override
    public void displayRole() {
        System.out.println("Staff");
    }

    // Method to display staff details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.printf("Job Title: %s%n", jobTitle);
    }
}