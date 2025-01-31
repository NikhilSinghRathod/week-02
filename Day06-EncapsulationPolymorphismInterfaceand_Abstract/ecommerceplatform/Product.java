package ecommerceplatform;
import java.util.ArrayList;
import java.util.List;
// Creating an abstract class Product to represent generic products (Superclass)
abstract class Product {
    // Declaring private attributes for the Product class
    private String productId;
    private String name;
    private double price;

    // Constructor to initialize Product objects with provided values
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to be implemented in subclasses to calculate discount
    public abstract double calculateDiscount();

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }

    // Getter and setter methods for encapsulation
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Creating an interface Taxable with methods for tax-related actions
interface Taxable {
    double calculateTax();
    void getTaxDetails();
}


