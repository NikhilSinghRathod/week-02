package multilevelinheritance.educationalcourse;

  // Creating a class OnlineCourse to represent online courses inheriting from Course (Subclass)
class OnlineCourse extends Course {
    // Unique attributes for OnlineCourse
    protected String platform;
    protected boolean isRecorded;

    // Constructor to initialize OnlineCourse objects with provided values
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Calling the base class constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding the displayCourseDetails() method to include platform and recording information
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Calling the base class method
        System.out.printf("Platform: %s, Is Recorded: %b%n", platform, isRecorded);
    }
}

