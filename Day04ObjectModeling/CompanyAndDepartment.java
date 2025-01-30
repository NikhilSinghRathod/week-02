import java.util.ArrayList;

// Creating an Employee class to represent individual employees
class Employee
{
    // Declaring attributes for the Employee class
    private String name;
    private int id;

    // Constructor to initialize Employee objects with provided values
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display employee details
    public void display()
    {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

// Creating a Department class to represent different departments within the company
class Department
{
    // Declaring attributes for the Department class
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor to initialize Department objects with provided name
    public Department(String departmentName)
    {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>(); // Initializing the ArrayList of employees
    }

    // Method to add an employee to the department
    public void addEmployee(String name, int id)
    {
        employees.add(new Employee(name, id));
    }

    public String getDepartmentName() {
        return departmentName;
    }
    // Method to display all employees in the department
    public void display()
    {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees)
        {
            employee.display();
        }
    }
}

// Creating a Company class to manage departments and employees
class Company {
    // Declaring attributes for the Company class
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor to initialize the Company object with provided name
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>(); // Initializing the ArrayList of departments
    }

    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Method to retrieve a department by name
    public Department getDepartment(String departmentName)
    {
        for (Department department : departments) {
            if (departmentName.equals(department.getDepartmentName())) {
                return department;
            }
        }
        return null; // Department not found
    }

    // Method to display all departments and their employees in the company
    public void display() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.display();
        }
    }

    // Override the finalize method to display a message when the Company object is deleted
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Company " + companyName + " is being deleted, along with its departments and employees.");
        
    }
}

// Creating class Problem3 to demonstrate the functionalities of the Company, Department, and Employee classes
class CompanyAndDepartment
{
    public static void main(String[] args)
    {
        // Creating a Company object
        Company myCompany = new Company("TechCorp");

        // Adding Departments to the company
        myCompany.addDepartment("Engineering");
        myCompany.addDepartment("HR");

        // Adding Employees to Departments
        Department engineering = myCompany.getDepartment("Engineering");
        if (engineering != null) {
            engineering.addEmployee("Alice", 101);
            engineering.addEmployee("Bob", 102);
        }

        Department hr = myCompany.getDepartment("HR");
        if (hr != null) {
            hr.addEmployee("Charlie", 201);
        }

        // Displaying the Company structure
        myCompany.display();

        // Setting myCompany to null and suggesting garbage collection
        myCompany = null;
        System.gc();

        // Note: The finalize method may not run immediately or at all, depending on JVM optimizations.
    }
}