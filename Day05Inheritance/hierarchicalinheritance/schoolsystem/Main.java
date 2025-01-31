package hierarchicalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        Student student = new Student("Bob", 16, "A");
        Staff staff = new Staff("Charlie", 45, "Janitor");

        // Displaying roles and details
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        student.displayRole();
        student.displayDetails();
        System.out.println();

        staff.displayRole();
        staff.displayDetails();
    }
}
