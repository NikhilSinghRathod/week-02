public class Student{
   public static void main(String[] args) {
     //create a student class object
     Student s = new Student(191211103, "Nigam", 8.8);
     s.displayStudentDetails();
     System.out.println("---------------");
     s.setCGPA(9.2);
     s.displayStudentDetails();
     System.out.println("---------------");
     //creating the sub class object
     PostgraduateStudent p = new PostgraduateStudent(0, null, 0);
     p.displayPostgraduateDetails();
     System.out.println("---------------");
     p.setCGPA(9.9);
     p.displayPostgraduateDetails();
     
   }
   //Attributes
   public int rollNumber;
   protected String name;
   private double CGPA ;

   //constructor 
   Student(int rollNumber , String name , double CGPA){
    this.rollNumber = rollNumber;
    this.name = name;
    this.CGPA = CGPA;
   }

   //public method to access CGPA
   public double getCGPA(){
    return CGPA;
   }

   //public method to modify CGPA
   public void setCGPA(double CGPA){
    if (CGPA >= 0.0 && CGPA <= 10.0) {
        this.CGPA = CGPA;
    } else {
        System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
    }
   }
   //method to display student details
   public void displayStudentDetails() {
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Name: " + name);
    System.out.println("CGPA: " + getCGPA());
}
}
class PostgraduateStudent extends Student{
     
    public PostgraduateStudent(int rollNumber , String name, double CGPA){
        super(2500211, "Nikhil", 8.5);
    }

    //method to display postgraduate student details
    public void displayPostgraduateDetails(){
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Public (Accessible)
        System.out.println("Name: " + name); // Protected (Accessible within subclass)
        System.out.println("CGPA: " + getCGPA()); // Accessing private CGPA through public getter
    
    }
}