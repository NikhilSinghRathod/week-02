import java.util.Scanner;
public class AreaOfCircle {
    // The attributes of the class Area of Circle
    private double radius;
    
    //create the method to calculate the area of circle
    AreaOfCircle(double radius){
        this.radius= radius;
    }
    
    //A method for calclating the area of circle
    public double area(double radius){
        double areaOf= 3.14*radius*radius;
        return areaOf;
    }
    //method for the calculation of the circumference
    public double circumference(double radius){
        double cir= 2*3.14*radius;
        return cir;
    }

    //A met
    
    //create a method to display the result
    public void displayResult(){
        System.out.println("The radius of the circle is :"+radius);
        System.out.println("The area of circle is : "+area(radius));
        System.out.println("The circumference of circle :"+circumference(radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user input
        System.out.println("Enter the radius : ");
        double input = sc.nextDouble();
        
        AreaOfCircle area = new AreaOfCircle(input);

        area.displayResult();

        sc.close();
    }

   
}
