package onlinefooddeliverysystem;

abstract class FoodItem {
    // Declaring private attributes for the FoodItem class
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize FoodItem objects with provided values
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to be implemented in subclasses to calculate total price
    public abstract double calculateTotalPrice();

    // Method to display item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    // Getter and setter methods for encapsulation
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Creating an interface Discountable with methods for discount-related actions
interface Discountable {
    void applyDiscount(double percentage);
    boolean isDiscountAvailable();
    void setDiscountAvailable(boolean available);
    void getDiscountDetails();
}

