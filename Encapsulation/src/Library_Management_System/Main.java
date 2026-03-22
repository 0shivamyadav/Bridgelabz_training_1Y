package Library_Management_System;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        LibraryItem b1 = new Book(1, "Java Programming", "James Gosling");
        LibraryItem m1 = new Magazine(2, "Tech Today", "John Doe");
        LibraryItem d1 = new DVD(3, "Inception", "Christopher Nolan");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                r.checkAvailability();
                r.reserveItem("Alice");
                r.checkAvailability();
            }

            System.out.println("----------------------");
        }
    }
}