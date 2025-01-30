import java.util.ArrayList;

// Creating a Patient class to represent patients in the hospital
class Patient {
    // Declaring attributes for the Patient class
    private String name;
    private int id;
    private ArrayList<Doctor> doctors;

    // Constructor to initialize Patient objects with provided name and id
    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
        this.doctors = new ArrayList<>(); // Initializing the ArrayList of doctors
    }

    // Getter method for the patient name
    public String getName() {
        return name;
    }

    // Method to add a doctor to the patient's list of consulting doctors
    public void consultDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Maintain bidirectional association
        }
    }

    // Method to display all doctors the patient is consulting
    public void displayDoctors() {
        System.out.println("Patient: " + name + " (ID: " + id + ") is consulting:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName() + " (Specialization: " + doctor.getSpecialization() + ")");
        }
    }

    public int getId() {
        return id;
    }
}

// Creating a Doctor class to represent doctors in the hospital
class Doctor {
    // Declaring attributes for the Doctor class
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    // Constructor to initialize Doctor objects with provided name and specialization
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>(); // Initializing the ArrayList of patients
    }

    // Getter method for the doctor name
    public String getName() {
        return name;
    }

    // Getter method for the doctor specialization
    public String getSpecialization() {
        return specialization;
    }

    // Method to add a patient to the doctor's list of patients
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.consultDoctor(this); // Maintain bidirectional association
        }
    }

    // Method to simulate a consultation with a patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " (Specialization: " + specialization + ") is consulting Patient: " + patient.getName());
    }

    // Method to display all patients the doctor is consulting
    public void displayPatients() {
        System.out.println("Dr. " + name + " (Specialization: " + specialization + ") is consulting the following patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName() + " (ID: " + patient.getId() + ")");
        }
    }
}

// Creating a Hospital class to manage doctors and patients
class Hospital {
    // Declaring attributes for the Hospital class
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor to initialize the Hospital object with provided name
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>(); // Initializing the ArrayList of doctors
        this.patients = new ArrayList<>(); // Initializing the ArrayList of patients
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Method to display all doctors and patients in the hospital
    public void displayHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName() + " (Specialization: " + doctor.getSpecialization() + ")");
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName() + " (ID: " + patient.getId() + ")");
        }
    }
}

// Creating class Problem6 to demonstrate the functionalities of the Hospital, Doctor, and Patient classes
 class HospitalManage {
    public static void main(String[] args) {
        // Creating a Hospital object
        Hospital myHospital = new Hospital("City Health Hospital");

        // Creating Doctor objects
        Doctor drSmith = new Doctor("Smith", "Cardiology");
        Doctor drJohnson = new Doctor("Johnson", "Neurology");
        Doctor drWilliams = new Doctor("Williams", "Pediatrics");

        // Creating Patient objects
        Patient alice = new Patient("Alice", 101);
        Patient bob = new Patient("Bob", 102);
        Patient charlie = new Patient("Charlie", 103);

        // Adding Doctors and Patients to the Hospital
        myHospital.addDoctor(drSmith);
        myHospital.addDoctor(drJohnson);
        myHospital.addDoctor(drWilliams);

        myHospital.addPatient(alice);
        myHospital.addPatient(bob);
        myHospital.addPatient(charlie);

        // Establishing consultations
        alice.consultDoctor(drSmith);
        alice.consultDoctor(drJohnson);
        bob.consultDoctor(drWilliams);
        bob.consultDoctor(drSmith);
        charlie.consultDoctor(drJohnson);

        // Displaying hospital info
        myHospital.displayHospitalInfo();

        // Displaying consultations
        drSmith.displayPatients();
        drJohnson.displayPatients();
        drWilliams.displayPatients();

        alice.displayDoctors();
        bob.displayDoctors();
        charlie.displayDoctors();

        // Simulating a consultation
        drSmith.consult(alice);
        drWilliams.consult(bob);
    }
}