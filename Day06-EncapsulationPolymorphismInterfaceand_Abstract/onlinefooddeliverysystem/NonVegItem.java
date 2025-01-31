package onlinefooddeliverysystem;

// Creating a class NonVegItem to represent specific non-vegetarian food items inheriting from FoodItem (Subclass)
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private boolean discountAvailable;

    // Constructor to initialize NonVegItem objects with provided values
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity); // Calling the superclass constructor
        this.additionalCharge = additionalCharge;
    }

    // Implementing the calculateTotalPrice() method for non-vegetarian items
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    // Implementing the applyDiscount() method for non-vegetarian items
    @Override
    public void applyDiscount(double percentage) {
        if (discountAvailable) {
            double discount = getPrice() * percentage / 100;
            setPrice(getPrice() - discount);
            System.out.println("Discount applied: " + discount);
        } else {
            System.out.println("Discount not available.");
        }
    }

    // Implementing the isDiscountAvailable() method
    @Override
    public boolean isDiscountAvailable() {
        return discountAvailable;
    }

    // Implementing the setDiscountAvailable() method
    @Override
    public void setDiscountAvailable(boolean available) {
        this.discountAvailable = available;
    }

    // Method to display discount details
    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: " + (discountAvailable ? "Available" : "Not Available"));
    }
}
