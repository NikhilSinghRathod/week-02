package assistedProblems.employeemanagement;

class Manager extends Employee {
    //unique elements
    private int teamSize;
    //calling super class constructor
     Manager(String name , int id , double salary , int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
     }

     // Overriding the displayDetails() method to include team size information
     @Override
     public void displayDetails(){
        super.displayDetails();
        System.out.println("Team members : "+teamSize);
     }
}
