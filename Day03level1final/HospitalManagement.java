class patient{
    //static variable 
    public static String hospitalName = "Ambani Hospital";
    //final variable
    private final int patientId;
    //public static variable
    public static int totalPatient = 0;
    //Attributes
    private String Name ; 
    private int age ; 
    private String aligment;

    //parameterized constructor
    public patient(int patientId , String Name ,int age , String aligment){
       this.Name = Name;
       this.age = age;
       this.aligment = aligment;
       this.patientId = patientId;
       totalPatient++;
    }
    //A method for the display
    public void display(){
        if(this instanceof patient){
        System.out.println("Patient Name :"+Name);
        System.out.println("Age :"+age);
        System.out.println("Aligment :"+aligment);
        System.out.println("Patient id :"+patientId);
        }else{
            System.out.println("Not an instance ");
        }
    }
    // Static method to set hospital name
    public static void setHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
    }

    // Static method to get hospital name
    public static String getHospitalName() {
        return hospitalName;
    }

}
public class HospitalManagement {
    public static void main(String[] args) {
        patient p = new patient(5631,"Nitesh",25,"fracture");
        patient p2 = new patient(456555, "Ajay", 22, "flu");
        //display hospital name and total patient
        System.out.println("Hospital Name :"+patient.getHospitalName());
        System.out.println("Total number of patien in the hospital :"+patient.totalPatient);
        //Displaying the details of patient
        System.out.println("Patient details");
        p.display();
        System.out.println("----------------");
        p2.display();


    }
    
}
