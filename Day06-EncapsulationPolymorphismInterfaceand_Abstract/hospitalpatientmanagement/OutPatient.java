package hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
// Creating a class OutPatient to represent specific outpatient cases inheriting from Patient (Subclass)
class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;

    // Constructor to initialize OutPatient objects with provided values
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age); // Calling the superclass constructor
        this.consultationFee = consultationFee;
    }

    // Implementing the calculateBill() method for outpatients
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementing the addRecord() method for outpatients
    @Override
    public void addRecord(String record) {
        records.add(record);
        System.out.println("Record added: " + record);
    }

    // Implementing the viewRecords() method for outpatients
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for OutPatient:");
        for (String record : records) {
            System.out.println(record);
        }
    }
}

