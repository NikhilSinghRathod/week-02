package employeemanagementsystem;

class PartTimeEmployee extends Employee{
    private int workHours ;
    private double hourlyRate;

     // Constructor to initialize PartTimeEmployee objects with provided values
     public PartTimeEmployee(String EmployeeId , String name ,double baseSalary , int workHours , double hourlyRate){
        super(EmployeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
     }

     //method to calculate salary
     @Override
     public double calculateSalary(){
        return workHours * hourlyRate;
     }

     // Getter and setter methods for encapsulation
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

// Creating an interface Department with methods for department-related actions
interface Department {
    void assignDepartment(String departmentName);
    void getDepartmentDetails();
}

