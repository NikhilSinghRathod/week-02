package employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;

// Creating an abstract class Employee to represent generic employees (Superclass)
abstract class Employee {
    //Attributes
    private String employeeId;
    private String name;
    private double baseSalary;

    // Constructor to initialize Employee objects with provided values
    Employee(String employeeId , String name , double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //Abstract method to calculate salary
    public abstract double calculateSalary();

    //method to display information
    public void displayDetails(){
        System.out.println("EmployeeId : "+employeeId);
        System.out.println("Name of the employee : "+name);
        System.out.println("Base salary : "+baseSalary);
    }

    //method to set the emplyee id getter and setters for 
    //method encapsulation
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    //method to get the emplyee id 
    public String getEmployeeId(){
        return employeeId;
    }

    //method to set the name 
    public void setEmployeename(String name){
        this.name=  name;
    }
    //method to get the name
    public String getEmployeename(){
        return name;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }
}
