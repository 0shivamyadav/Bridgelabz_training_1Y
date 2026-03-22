package Vehicle_Rental_System;

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(int vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days * 1.5;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.15;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Policy: " + policyNumber);
    }
}