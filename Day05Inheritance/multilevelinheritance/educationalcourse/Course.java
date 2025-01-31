package multilevelinheritance.educationalcourse;

public class Course {
    // Declaring protected attributes for the Course class
    protected String courseName;
    protected int duration; // Duration in weeks

    // Constructor to initialize Course objects with provided values
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.printf("Course Name: %s, Duration: %d weeks%n", courseName, duration);
    }
}

