public class Person {
    public static void main(String[] args) {
        Person p1 = new Person("Bhupendra",22,"Karond");
        p1.display();
        Person p2 = new Person(p1);
        p2.display();
    }

    //Attributes
    String name ;
    int age;
    String address;

    //Parameterzied constructor
    Person(String name , int age , String address ){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //copy constructor
    Person(Person other ){
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }
    //display person details
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Address :"+address);
    }

}
