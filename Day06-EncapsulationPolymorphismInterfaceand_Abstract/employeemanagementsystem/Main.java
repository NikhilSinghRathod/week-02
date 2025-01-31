package employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // Creating a list to store employees
        List<Employee> employees = new ArrayList<>();
    // Creating objects for each employee type and adding them to the list
    employees.add(new FullTimeEmployee("FT001", "Alice", 50000));
    employees.add(new FullTimeEmployee("FT002", "David", 52000));
    employees.add(new FullTimeEmployee("FT003", "Eva", 51000));
    employees.add(new FullTimeEmployee("FT004", "Frank", 53000));
    employees.add(new FullTimeEmployee("FT005", "Grace", 54000));
    employees.add(new PartTimeEmployee("PT001", "Bob", 0, 20, 25)); // 20 work hours * 25 hourly rate
    employees.add(new PartTimeEmployee("PT002", "Harry", 0, 15, 20)); // 15 work hours * 20 hourly rate
    employees.add(new PartTimeEmployee("PT003", "Ivy", 0, 30, 22)); // 30 work hours * 22 hourly rate
    employees.add(new PartTimeEmployee("PT004", "Jack", 0, 25, 18)); // 25 work hours * 18 hourly rate
    employees.add(new PartTimeEmployee("PT005", "Kate", 0, 10, 30)); // 10 work hours * 30 hourly rate
    for(Employee employee : employees){
        employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            System.out.println();
    }
  }

   
}
