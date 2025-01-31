package multilevelinheritance.onlineretailorder;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each class level
        Order order = new Order("ORD001", "2025-01-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-02", "TRK123");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-03", "TRK124", "2025-01-05");

        // Displaying order statuses and details
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus() + "\n");

        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus() + "\n");

        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
