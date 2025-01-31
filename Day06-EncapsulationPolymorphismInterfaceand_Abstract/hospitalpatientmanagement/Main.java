package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list to store patients
        List<Patient> patients = new ArrayList<>();

        // Creating objects for each patient type and adding them to the list
        patients.add(new InPatient("IP001", "Alice", 30, 5000, 10));
        patients.add(new InPatient("IP002", "Bob", 45, 4500, 7));
        patients.add(new InPatient("IP003", "Eve", 50, 4800, 12));
        patients.add(new InPatient("IP004", "Grace", 28, 5500, 8));
        patients.add(new InPatient("IP005", "Henry", 60, 6000, 15));

        patients.add(new OutPatient("OP001", "Charlie", 28, 800));
        patients.add(new OutPatient("OP002", "David", 50, 1200));
        patients.add(new OutPatient("OP003", "Ivy", 35, 900));
        patients.add(new OutPatient("OP004", "Jack", 40, 1000));
        patients.add(new OutPatient("OP005", "Lily", 55, 1100));

        // Processing and displaying details of each patient using polymorphism
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            double bill = patient.calculateBill();
            System.out.println("Calculated Bill: " + bill);

            // Polymorphic behavior for MedicalRecord interface
            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                medicalRecord.addRecord("Record 1");
                medicalRecord.addRecord("Record 2");
                medicalRecord.addRecord("Record 3");
                medicalRecord.addRecord("Record 4");
                medicalRecord.viewRecords();
            }
            System.out.println();
        }
    }
}
