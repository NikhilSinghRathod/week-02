import java.util.ArrayList;

// Creating a Course class to represent courses offered at the school
class Course
{
    // Declaring attributes for the Course class
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Constructor to initialize Course objects with provided course name
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>(); // Initializing the ArrayList of enrolled students
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // Maintain bidirectional association
        }
    }

    // Getter method for the course name
    public String getCourseName() {
        return courseName;
    }

    // Method to display all enrolled students in the course
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}

// Creating a Student class to represent students in the school
class Student {
    // Declaring attributes for the Student class
    private String name;
    private int id;
    private ArrayList<Course> enrolledCourses;

    // Constructor to initialize Student objects with provided name and id
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>(); // Initializing the ArrayList of enrolled courses
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
           // course.enrollStudent(this); 
        }
    }

    // Getter method for the student name
    public String getName() {
        return name;
    }

    // Method to display all courses the student is enrolled in
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name + " (ID: " + id + ") - Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println(course.getCourseName());
        }
    }
}

// Creating a School class to manage students and courses
class School {
    // Declaring attributes for the School class
    private String schoolName;
    private ArrayList<Student> students;

    // Constructor to initialize the School object with provided name
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>(); // Initializing the ArrayList of students
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to display all students in the school
    public void displayStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

// Creating class Problem4 to demonstrate the functionalities of the School, Student, and Course classes
class Problem4 {
    public static void SchoolAndStudent(String[] args) {
        // Creating a School object
        School mySchool = new School("Greenwood High");

        // Creating 15 Student objects and adding them to the school
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            students.add(new Student("Student" + i, 100 + i));
            mySchool.addStudent(students.get(i - 1));
        }

        // Creating 5 Course objects
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");
        Course history = new Course("History");
        Course computerScience = new Course("Computer Science");

        // Enrolling Students in Courses based on conditions
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) students.get(i).enrollInCourse(math);
            if (i % 3 == 0) students.get(i).enrollInCourse(science);
            if (i % 4 == 0) students.get(i).enrollInCourse(english);
            if (i % 5 == 0) students.get(i).enrollInCourse(history);
            students.get(i).enrollInCourse(computerScience);
        }

        // Displaying all students in the school
        mySchool.displayStudents();

        // Displaying enrolled students for each course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        english.displayEnrolledStudents();
        history.displayEnrolledStudents();
        computerScience.displayEnrolledStudents();

        // Displaying enrolled courses for each student
        for (Student student : students) {
            student.displayEnrolledCourses();
        }
    }
}

