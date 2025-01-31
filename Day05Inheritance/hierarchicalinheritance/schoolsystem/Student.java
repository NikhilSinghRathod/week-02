package hierarchicalinheritance.schoolsystem;

// Creating a class Student to represent specific Student objects inheriting from Person (Subclass)
class Student extends Person {
    // Unique attribute for Student
    private String grade;

    // Constructor to initialize Student objects with provided values
    public Student(String name, int age, String grade) {
        super(name, age); // Calling the superclass constructor
        this.grade = grade;
    }

    // Overriding the displayRole() method to specify the role
    @Override
    public void displayRole() {
        System.out.println("Student");
    }

    // Method to display student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the superclass method
        System.out.printf("Grade: %s%n", grade);
    }
}
