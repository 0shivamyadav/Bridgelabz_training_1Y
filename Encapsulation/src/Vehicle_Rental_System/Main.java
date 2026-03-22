package Vehicle_Rental_System;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(101, 1000, "CAR123");
        vehicles[1] = new Bike(102, 500, "BIKE456");
        vehicles[2] = new Truck(103, 2000, "TRUCK789");

        int days = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rent = v.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days: " + rent);

            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost: " + ins.calculateInsurance());
            ins.getInsuranceDetails();

            System.out.println("-------------------------");
        }
    }
}