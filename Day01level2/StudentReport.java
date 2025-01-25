public class StudentReport{
    String name;
    int rollNumber;
    double  marks;

    //create a constructor
    StudentReport(String name , int rollNumber , double marks){
      this.name = name;
      this.marks = marks;
      this.rollNumber = rollNumber;
    }

    //method for calculate grade
    public String calculateGrade(){
        if(marks>=33 && marks <=100){
            return "PASS";
        }else if(marks>=0 && marks<33){
           return "FAIL";
        }else{
            return "INVALID NUMBER ";
        }
    }
    //Create a method to display the result
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll No :"+rollNumber);
        System.out.println("Marks :"+marks);
        System.out.println("Grade :"+calculateGrade());
    }

    public static void main(String[] args) {
        StudentReport student = new StudentReport("Nikhil", 102, 1);
        student.display();
    }
}