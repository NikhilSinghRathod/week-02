class Product {
    // Static variable shared across all product instances
    private static double discount = 10.0; // Default discount percentage

    // Final variable to ensure the product ID cannot be changed once assigned
    private final int productID;

    // Instance variables for product details
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize product details
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to calculate final price after discount
    public double getFinalPrice() {
        return price * quantity * (1 - discount / 100);
    }

    // Method to display product details using instanceof
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price after discount: $" + getFinalPrice());
        } else {
            System.out.println("Invalid product instance.");
        }
    }

    // Getter for discount
    public static double getDiscount() {
        return discount;
    }
}

public class ShoppingCart{
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product(101, "Laptop", 800.00, 1);
        Product product2 = new Product(102, "Smartphone", 500.00, 2);

        // Displaying product details
        System.out.println("Initial Product Details:");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        // Updating discount for all products
        Product.updateDiscount(15.0);
        System.out.println("\nUpdated Discount: " + Product.getDiscount() + "%");

        // Displaying product details after discount update
        System.out.println("\nProduct Details After Discount Update:");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}
