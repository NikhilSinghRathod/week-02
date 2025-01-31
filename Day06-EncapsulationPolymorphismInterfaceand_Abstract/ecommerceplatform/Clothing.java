package ecommerceplatform;

// Creating a class Clothing to represent specific clothing products inheriting from Product (Subclass)
class Clothing extends Product implements Taxable {
    // Constructor to initialize Clothing objects with provided values
    public Clothing(String productId, String name, double price) {
        super(productId, name, price); // Calling the superclass constructor
    }

    // Implementing the calculateDiscount() method for clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount on clothing
    }

    // Implementing the calculateTax() method for clothing
    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax on clothing
    }

    // Method to display tax details
    @Override
    public void getTaxDetails() {
        System.out.println("Tax: 12%");
    }
}

