package assistedProblems.employeemanagement;

 class Intern extends Employee {
     //unique attributes
    private int time;

      // Constructor to initialize Intern objects with provided values
    public Intern(String name, int id, double salary, int time) {
        super(name, id, salary); // Calling the superclass constructor
        this.time = time;
    }

    // Overriding the displayDetails() method to include time information
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Time for the internship :"+time);
    }
}
