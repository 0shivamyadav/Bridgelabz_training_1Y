package Vehicle_Rental_System;

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(int vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Policy: " + policyNumber);
    }
}