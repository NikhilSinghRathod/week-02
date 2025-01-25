public class Circle {
    public static void main(String[] args) {
        //Default constructor calling
        Circle c = new Circle();
        c.display();
       //parameterized constructor is called
       Circle c1= new Circle(6);
       c1.display();
       
    }

    //Attributes
    private double radius;

    //Default constructor
    Circle(){
        this.radius=4.5;
        System.out.println("Default constructor");
    }

    //parameterized constructor
    Circle(double radius){
        this.radius = radius;
        System.out.println("Parameterized constructor");
    }

    //A method for calclating the area of circle
    public double area(double radius){
        double areaOf= 3.14*radius*radius;
        return areaOf;
    }
    
    //Displaying the result
    public void display(){
        System.out.println("The radius of the circle is :"+radius);
        System.out.println("The area of circle is :"+area(radius));
    }
}
