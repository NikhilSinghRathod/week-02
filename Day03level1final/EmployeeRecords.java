// Base class: Employee
class Employee {
    //Public variable 
    public static String companyName = "Capgemini";

    // Public member: Accessible from anywhere
    public int employeeID;

    // Protected member: Accessible within the package and subclass
    protected String department;

    // Private member: Accessible only within the class
    private double salary;

    //public member total employee
    public static int totalEmployee = 0;

    // Constructor to initialize employee details
    public  Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        totalEmployee++;
    }

    // Public method to set salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: $" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());
    }

    //method to get total employee
    public static int gettotalEmployee(){
        return totalEmployee;
    }
}

// Subclass: Manager (inherits from Employee)
class Manager extends Employee {
    private String managedTeam;

    // Constructor for Manager
    public Manager(int employeeID, String department, double salary, String managedTeam) {
        super(employeeID, department, salary);
        this.managedTeam = managedTeam;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID: " + employeeID);  // Accessing public attribute
        System.out.println("Department: " + department);   // Accessing protected attribute
        System.out.println("Managed Team: " + managedTeam);
    }
}

// Main class to test the Employee and Manager classes
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "Finance", 50000);
        emp1.displayEmployeeDetails();
        
        // Modifying salary
        emp1.setSalary(55000);
        emp1.displayEmployeeDetails();

        System.out.println("\n--------------------------------\n");

        // Creating a Manager object
        Manager mgr1 = new Manager(202, "IT", 75000, "Software Development");
        mgr1.displayManagerDetails();
        
        // Accessing inherited methods
        mgr1.setSalary(80000);
        mgr1.displayEmployeeDetails();
        System.out.println("The total number of :"+Employee.gettotalEmployee());
    }
}
