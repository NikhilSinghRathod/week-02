package hospitalpatientmanagement;

// Creating an abstract class Patient to represent generic patients (Superclass)
abstract class Patient {
    // Declaring private attributes for the Patient class
    private String patientId;
    private String name;
    private int age;

    // Constructor to initialize Patient objects with provided values
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented in subclasses to calculate bill
    public abstract double calculateBill();

    // Method to display patient details
    public String getPatientDetails() {
        return ("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    // Getter and setter methods for encapsulation
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Creating an interface MedicalRecord with methods for medical record-related actions
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
