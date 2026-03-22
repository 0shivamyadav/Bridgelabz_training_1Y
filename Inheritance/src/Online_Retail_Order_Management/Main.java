package Online_Retail_Order_Management;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1, "2026-03-20");
        System.out.println("=== Basic Order ===");
        order.display();

        System.out.println("\n=== Shipped Order ===");
        ShippedOrder shipped = new ShippedOrder(2, "2026-03-18", "TRK12345");
        shipped.display();

        System.out.println("\n=== Delivered Order ===");
        DeliveredOrder delivered = new DeliveredOrder(3, "2026-03-15", "TRK67890", "2026-03-21");
        delivered.display();
    }
}