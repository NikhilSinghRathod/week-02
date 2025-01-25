public class OnlineCourse {
    public static void main(String[] args) {
        OnlineCourse o = new OnlineCourse("JEE", 2, 45000);
        o.display();
        System.out.println("--------------------");
        OnlineCourse o2 = new OnlineCourse("Neet", 1, 60000);
        o2.display();
        OnlineCourse.instituteName = "Pw";
        System.out.println("--------------------");
        OnlineCourse o3 = new OnlineCourse("JAVA", 1, 4500);
        o3.display();
    }
    //Instance variables or attributes
    String courseName;
    int time;
    int fee;
    //class variable
    static String instituteName = "Allen";

    //parameterized constructor
    OnlineCourse(String courseName , int time , int fee){
      this.courseName =courseName;
      this.time = time;
      this.fee = fee;
    }
    public static void updateInstituteName(String instituteNewName){
        instituteName =instituteNewName;
    }
    public void display(){
        System.out.println("The name of the course is : "+courseName);
        System.out.println("The duration of the course :"+time);
        System.out.println("fees :"+fee);
        System.out.println("Name of Institute :"+instituteName);
    }
}
