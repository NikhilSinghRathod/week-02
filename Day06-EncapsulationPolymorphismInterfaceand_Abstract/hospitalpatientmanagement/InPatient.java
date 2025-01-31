package hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
// Creating a class InPatient to represent specific inpatient cases inheriting from Patient (Subclass)
class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double dailyRate;
    private int daysAdmitted;

    // Constructor to initialize InPatient objects with provided values
    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age); // Calling the superclass constructor
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    // Implementing the calculateBill() method for inpatients
    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    // Implementing the addRecord() method for inpatients
    @Override
    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added: " + record);
    }

    // Implementing the viewRecords() method for inpatients
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for InPatient:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}
