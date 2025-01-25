public class EmployeeDetails{
    //creating the attributes of class Employee
    String name ;
    int id;
    int salary;

    //creating the constructor 
    EmployeeDetails(String name , int id , int salary){
        this.name = name;
        this.id = id;
        this.salary=salary;
    }
    
    //creating a method to display the answers
    public void displayDetails(){
        System.out.println("The name of the employee is : "+name);
        System.out.println("The id of the employee is : "+id);
        System.out.println("The salary of the employee is : "+salary);
    }
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails("nikhil",1654,  28096);
        e.displayDetails();
    }
    
}