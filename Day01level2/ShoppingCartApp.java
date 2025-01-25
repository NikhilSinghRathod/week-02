//import java.util.Scanner;
public class ShoppingCartApp {
  public static void main(String[] args) {
    shoppingCart sc = new shoppingCart();
    sc.addItem("laptop", 1000 ,1);
    sc.addItem("Smartphone",700,2);

    //display cart contents
    sc.displayCart();
    
    //display total cost
    sc.displayTotalCost();

    //remove an item
    sc.removeItem("laptop");

    //display cart contents after removal
    sc.displayCart();

    //display total cost after the removal
    sc.displayTotalCost();

    
  }  
  
}

class ItemCart{
    String itemName;
    double price;
    int quantity;

    //constructor to assigh
    public ItemCart(String itemName , double price , int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double gettotal(){
        return price*quantity;
    }
}

class shoppingCart{
    //cart item store
  public static ItemCart[] cartItems = new ItemCart[10];
  static int itemCount = 0 ;

  //Add an item to the cart
  public void addItem(String itemName ,double price , int quantity ){
    if(itemCount>=cartItems.length){
        System.out.println("The cart is full ");
    }
        cartItems[itemCount++] = new ItemCart(itemName, price, quantity);
        System.out.println("Item added successfully");
  } 

  //remove an item from the cart
  public void removeItem(String itemName){
    boolean itemFound = false;

    for(int i=0 ;i<itemCount ; i++){
        if(cartItems[i].itemName.equalsIgnoreCase(itemName)){
            //shift the remaining elements
            for(int j =i ; j< itemCount-1 ; j++){
                cartItems[j] = cartItems[j+1];
            }
            cartItems[itemCount - 1]=null;
            itemCount--;
            itemFound = true;
            System.out.println(itemName + "removed from the cart");
            break;
        }
    }
    if(itemFound){
        System.out.println("Item "+ itemName + "not foung in the cart");
    }
  }
  //display the total cost of all the items in the cart
  public void displayTotalCost(){
    double totalCost = 0;
    for(int i=0 ; i<itemCount; i++){
        totalCost += cartItems[i].gettotal();
    }
    System.err.println("The cost of all the items in the cart is :"+totalCost);
  }

  //display the items in the cart
  public void displayCart(){
     if(itemCount == 0){
        System.out.println("The cart is empty ");
  }else{
    System.out.println("The items in the cart is :");
    for(int i=0;i<itemCount;i++){
        System.out.println(cartItems[i].itemName+" "+cartItems[i].price+" "+cartItems[i].quantity);
    }
  }
 }
 
}
