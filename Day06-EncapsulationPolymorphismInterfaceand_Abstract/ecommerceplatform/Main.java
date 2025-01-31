package ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list to store products
        List<Product> products = new ArrayList<>();

        // Creating objects for each product type and adding them to the list
        products.add(new Electronics("E001", "Laptop", 60000));
        products.add(new Electronics("E002", "Smartphone", 30000));
        products.add(new Clothing("C001", "T-Shirt", 500));
        products.add(new Clothing("C002", "Jeans", 1200));
        products.add(new Groceries("G001", "Rice", 100));
        products.add(new Groceries("G002", "Milk", 50));

        // Processing and displaying details of each product using polymorphism
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = ((Taxable) product).calculateTax();
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
