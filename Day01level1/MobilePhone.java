public class MobilePhone {
    String brand ;
    String model ;
    int price;
    MobilePhone(String brand , String model , int price){
        this.brand= brand;
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.println("The brand of the phone is :"+brand);
        System.out.println("The model of the phone is :"+model);
        System.out.println("The price of the phone is :"+price);
    }

    public static void main(String[] args) {
        MobilePhone mobile1 = new MobilePhone("Samsung" ,  "s22", 48000);
        mobile1.display();
        System.out.println(" ");
        MobilePhone mobile2 = new MobilePhone("Apple","13pro max",29000);
        mobile2.display();
    }
}
