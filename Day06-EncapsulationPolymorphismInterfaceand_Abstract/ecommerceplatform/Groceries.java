package ecommerceplatform;

// Creating a class Groceries to represent specific grocery products inheriting from Product (Subclass)
class Groceries extends Product implements Taxable {
    // Constructor to initialize Groceries objects with provided values
    public Groceries(String productId, String name, double price) {
        super(productId, name, price); // Calling the superclass constructor
    }

    // Implementing the calculateDiscount() method for groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount on groceries
    }

    // Implementing the calculateTax() method for groceries
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax on groceries
    }

    // Method to display tax details
    @Override
    public void getTaxDetails() {
        System.out.println("Tax: 5%");
    }
}

