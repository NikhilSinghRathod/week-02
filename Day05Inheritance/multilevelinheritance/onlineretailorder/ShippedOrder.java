package multilevelinheritance.onlineretailorder;

class ShippedOrder extends Order {
    //unique attributes
    protected String trackingNumber;

     // Constructor to initialize ShippedOrder objects with provided values
     public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Calling the base class constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding the getOrderStatus() method to return the shipped status
    @Override
    public String getOrderStatus() {
        return "Order shipped";
    }

        // Method to display shipped order details
        @Override
        public void displayOrderDetails() {
            super.displayOrderDetails(); // Calling the base class method
            System.out.printf("Tracking Number: %s%n", trackingNumber);
        }
}
