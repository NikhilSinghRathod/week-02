package ecommerceplatform;

// Creating a class Electronics to represent specific electronic products inheriting from Product (Subclass)
class Electronics extends Product implements Taxable {
    // Constructor to initialize Electronics objects with provided values
    public Electronics(String productId, String name, double price) {
        super(productId, name, price); // Calling the superclass constructor
    }

    // Implementing the calculateDiscount() method for electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount on electronics
    }

    // Implementing the calculateTax() method for electronics
    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax on electronics
    }

    // Method to display tax details
    @Override
    public void getTaxDetails() {
        System.out.println("Tax: 18%");
    }
}

