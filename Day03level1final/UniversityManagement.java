class Student {
    // Static variable shared across all student instances
    private static String universityName = "Global University";
    
    // Static variable to track the total number of students
    private static int totalStudents = 0;
    
    // Final variable to ensure roll number cannot be changed once assigned
    private final int rollNumber;
    
    // Instance variables for student details
    private String name;
    private char grade;

    // Constructor using 'this' to initialize student details
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;  // Increment total students when a new student is added
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details using instanceof
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student instance.");
        }
    }

    // Method to update student grade after checking instanceof
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully for " + name);
        } else {
            System.out.println("Invalid student instance.");
        }
    }

    // Static method to set university name
    public static void setUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }

    // Static method to get university name
    public static String getUniversityName() {
        return universityName;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice Johnson", 101, 'A');
        Student student2 = new Student("Bob Smith", 102, 'B');

        // Displaying university name and total students
        System.out.println("University: " + Student.getUniversityName());
        Student.displayTotalStudents();

        // Displaying student details
        System.out.println("\nStudent Details:");
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        // Updating student grade
        System.out.println("\nUpdating Grades:");
        student1.updateGrade('A');
        student2.updateGrade('B');

        // Displaying updated student details
        System.out.println("\nUpdated Student Details:");
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        // Changing university name and displaying updated details
        Student.setUniversityName("National University");
        System.out.println("\nUpdated University Name: " + Student.getUniversityName());

        student1.displayStudentDetails();
    }
}

