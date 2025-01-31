package multilevelinheritance.educationalcourse;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each class level
        Course course = new Course("Mathematics 101", 12);
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Data Structures", 10, "Coursera", true, 150.0, 20.0);

        // Displaying course details
        course.displayCourseDetails();
        System.out.println();

        onlineCourse.displayCourseDetails();
        System.out.println();

        paidOnlineCourse.displayCourseDetails();
    }
}
