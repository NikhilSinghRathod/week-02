package multilevelinheritance.onlineretailorder;

class Order {
    //Attributes
    protected String orderId ;
    protected String orderDate;

    //constructor to initialize the order class attributes
    public Order(String orderId , String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return the order status, to be overridden in subclasses if needed
    public String getOrderStatus() {
        return "Order placed";
    }

     // Method to display order details
     public void displayOrderDetails() {
        System.out.printf("Order ID: %s, Order Date: %s%n", orderId, orderDate);
    }
}
