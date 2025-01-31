package assistedProblems.employeemanagement;

 class Developer extends Employee {
    //unique attributes
    private String develop;
 
    // constructor to call the employee constructor
    public Developer(String name , int id , double salary , String develop){
        super(name , id , salary);
        this.develop = develop;
    }

    // Overriding the displayDetails() method to include time information
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Language on the developer works :"+develop);
    }
}
