package onlinefooddeliverysystem;

// Creating a class VegItem to represent specific vegetarian food items inheriting from FoodItem (Subclass)
class VegItem extends FoodItem implements Discountable {
    private boolean discountAvailable;

    // Constructor to initialize VegItem objects with provided values
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity); // Calling the superclass constructor
    }

    // Implementing the calculateTotalPrice() method for vegetarian items
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Implementing the applyDiscount() method for vegetarian items
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

