package E_Commerce_Platform;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Rice", 1000);

        products.add(p1);
        products.add(p2);
        products.add(p3);


        for (Product p : products) {
            p.displayDetails();

            double discount = p.calculateDiscount();
            double tax = 0;


            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                ((Taxable) p).getTaxDetails();
            }

            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("------------------------");
        }
    }
}