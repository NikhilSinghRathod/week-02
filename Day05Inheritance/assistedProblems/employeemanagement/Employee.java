package assistedProblems.employeemanagement;
 class Employee {
    //Attributes
       protected String name;
    protected int id ; 
    protected double salary;

    //constructor to initialize Employee objects with provided values
   public Employee(String name , int id , double salary){
    this.name = name;
    this.id = id;
    this.salary = salary;
    }

    //Method to display the details
    public void displayDetails(){
        System.out.println("Name of the employee :"+name);
        System.out.println("Id :"+id);
        System.out.println("Salary :"+salary);
    }
}
