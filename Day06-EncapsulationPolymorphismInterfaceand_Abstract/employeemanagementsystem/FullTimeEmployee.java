package employeemanagementsystem;

class FullTimeEmployee extends Employee {
    // Constructor to initialize FullTimeEmployee objects with provided values
    public FullTimeEmployee(String employeeId , String name , double baseSalary){
        super(employeeId, name, baseSalary);
    }

    //Abstract method to calculate salary
    @Override
    public double calculateSalary(){
        return getBaseSalary();
    }
}
