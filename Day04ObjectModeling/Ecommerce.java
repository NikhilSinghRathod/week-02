import java.util.ArrayList;


// Creating a Product class to represent individual products in the e-commerce platform
class Product {
    // Declaring attributes for the Product class
    private String productName;
    private double price;

    // Constructor to initialize the Product object with provided name and price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Getter method for the product name
    public String getProductName() {
        return productName;
    }

    // Getter method for the product price
    public double getPrice() {
        return price;
    }

    // Overriding the toString method to display product information
    @Override
    public String toString() {
        return productName + " ($" + price + ")";
    }
}

// Creating an Order class to represent customer orders in the e-commerce platform
class Order {
    // Declaring attributes for the Order class
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;

    // Constructor to initialize the Order object with provided orderId and customer
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>(); // Initializing the ArrayList of products
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in this Order:");
        double total = 0;
        for (Product product : products) {
            System.out.println("  - " + product);
            total += product.getPrice();
        }
        System.out.println("Total Price: $" + total);
    }
}

// Creating a Customer class to represent customers in the e-commerce platform
class Customer {
    // Declaring attributes for the Customer class
    private String name;
    private int customerId;
    private ArrayList<Order> orders;

    // Constructor to initialize the Customer object with provided name and customerId
    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.orders = new ArrayList<>(); // Initializing the ArrayList of orders
    }

    // Getter method for the customer name
    public String getName() {
        return name;
    }

    // Method for the customer to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Method to display all orders placed by the customer
    public void displayCustomerOrders() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Creating class Problem7 to demonstrate the functionalities of the e-commerce platform
public class Ecommerce {
    public static void main(String[] args) {
        // Creating Product objects
        Product laptop = new Product("Laptop", 800.00);
        Product phone = new Product("Smartphone", 500.00);
        Product headphones = new Product("Headphones", 100.00);

        // Creating a Customer object
        Customer customer = new Customer("John Doe", 101);

        // Creating Order objects and adding products to them
        Order order1 = new Order(1, customer);
        order1.addProduct(laptop);
        order1.addProduct(phone);

        Order order2 = new Order(2, customer);
        order2.addProduct(headphones);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Displaying all orders placed by the customer
        customer.displayCustomerOrders();
    }
}
