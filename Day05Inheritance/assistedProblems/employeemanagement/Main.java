package assistedProblems.employeemanagement;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Employee manager = new Manager("Alice", 101, 95000, 10);
        Employee developer = new Developer("Bob", 102, 80000, "Java");
        Employee intern = new Intern("Charlie", 103, 30000, 6);

        // Displaying details for each employee
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
