import java.util.Scanner;
public class InventoryItem {
    String itemName;
    String itemCode ;
    int itemPrice;

    InventoryItem(String name , String code , int price){
        this.itemName = name;
        this.itemCode = code;
        this.itemPrice = price;
    }

    //create the method to calculate the price of item bought in quantity
    public int calculatePrice(int price, int quantity){
      return price*quantity;
    }

    //Method to display the details of item
    public void display(){
        System.out.println("The name of the item : "+itemName);
        System.out.println("The item code : "+itemCode);
        System.out.println("The price of the item : "+itemPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the item : ");
        String itemname = sc.nextLine();
        
        System.out.println("Enter the item code : ");
        String itemCode = sc.nextLine();

        System.out.println("Enter the price of the item : ");
        int price = sc.nextInt();
        
        int quantity;
        System.out.println("Enter the number of Quantity : ");
        quantity = sc.nextInt();

        //making object of the class InventoryItem
         InventoryItem item = new InventoryItem(itemname, itemCode, price);
         //calling method to display
        item.display();
        
        //
        System.out.println("The total price : "+ item.calculatePrice(price,quantity) + " of quantity "+quantity);
        sc.close();
    }
}
