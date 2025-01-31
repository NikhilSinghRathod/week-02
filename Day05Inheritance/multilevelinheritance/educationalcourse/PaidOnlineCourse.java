package multilevelinheritance.educationalcourse;

// Creating a class PaidOnlineCourse to represent paid online courses inheriting from OnlineCourse (Subclass)
class PaidOnlineCourse extends OnlineCourse {
    // Unique attributes for PaidOnlineCourse
    private double fee;
    private double discount;

    // Constructor to initialize PaidOnlineCourse objects with provided values
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Calling the subclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding the displayCourseDetails() method to include fee and discount information
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Calling the subclass method
        System.out.printf("Fee: %.2f, Discount: %.2f%%%n", fee, discount);
    }
}
