import java.util.ArrayList;

 // Creating a Faculty class to represent faculty members
 class Faculty {
     // Declaring attributes for the Faculty class
     public String name;
     private String specialization;
 
     // Constructor to initialize Faculty objects with provided values
     public Faculty(String name, String specialization) {
         this.name = name;
         this.specialization = specialization;
     }
 
     // Getter method for the faculty name
     public String getName() {
         return name;
     }
 
     // Getter method for the faculty specialization
     public String getSpecialization() {
         return specialization;
     }
 
     // Method to display faculty details
     public void display() {
         System.out.println("Faculty: " + name + ", Specialization: " + specialization);
     }
 }
 
 // Creating a Department class to represent departments within the university
 class Department {
     // Declaring attributes for the Department class
     private  String departmentName;
     private ArrayList<Faculty> faculties;
 
     // Constructor to initialize Department objects with provided name
     public Department(String departmentName) {
         this.departmentName = departmentName;
         this.faculties = new ArrayList<>(); // Initializing the ArrayList of faculties
     }
 
     // Method to add a faculty member to the department
     public void addFaculty(Faculty faculty) {
         if (!faculties.contains(faculty)) {
             faculties.add(faculty);
         }
     }
 
     // Method to display all faculty members in the department
     public void display() {
         System.out.println("Department: " + departmentName);
         if (faculties.isEmpty()) {
             System.out.println("  No faculty members in this department.");
         } else {
             System.out.println("  Faculties:");
             for (Faculty faculty : faculties) {
                 System.out.println("    - " + faculty.getName() + " (" + faculty.getSpecialization() + ")");
             }
         }
     }
 }
 
 // Creating a University class to manage departments and faculties
 class University {
     // Declaring attributes for the University class
     private String universityName;
     private ArrayList<Department> departments;
 
     // Constructor to initialize the University object with provided name
     public University(String universityName) {
         this.universityName = universityName;
         this.departments = new ArrayList<>(); // Initializing the ArrayList of departments
     }
 
     // Method to add a department to the university
     public void addDepartment(Department department) {
         if (!departments.contains(department)) {
             departments.add(department);
         }
     }
 
     // Method to display all departments and their faculties in the university
     public void display() {
         System.out.println("University: " + universityName);
         if (departments.isEmpty()) {
             System.out.println("  No departments in this university.");
         } else {
             for (Department department : departments) {
                 department.display();
             }
         }
     }
 
     // Method to delete the university and its departments
     public void deleteUniversity() {
         System.out.println("Deleting University: " + universityName);
         departments.clear(); // All departments are deleted as part of composition
     }
 }
 
 //
 // Creating class Problem5 to demonstrate the functionalities of the University, Department, and Faculty classes
 public class UniversityAd {
     public static void main(String[] args) {
         // Creating Faculty objects (can exist independently of a University)
         Faculty john = new Faculty("John Doe", "Mathematics");
         Faculty jane = new Faculty("Jane Smith", "Physics");
         Faculty alice = new Faculty("Alice Brown", "Computer Science");
 
         // Creating a University object
         University myUniversity = new University("Global Tech University");
 
         // Creating Department objects
         Department mathDepartment = new Department("Mathematics");
         Department csDepartment = new Department("Computer Science");
 
         // Adding Faculty members to Departments
         mathDepartment.addFaculty(john);
         mathDepartment.addFaculty(jane);
         csDepartment.addFaculty(alice);
 
         // Adding Departments to the University
         myUniversity.addDepartment(mathDepartment);
         myUniversity.addDepartment(csDepartment);
 
         // Displaying the University structure
         myUniversity.display();
 
         // Displaying an independent Faculty member
         System.out.println("\nIndependent Faculty:");
         alice.display();
 
         // Deleting the University and showing the impact on Departments
         myUniversity.deleteUniversity();
         myUniversity.display(); // Should show that all departments are deleted
     }
 }
