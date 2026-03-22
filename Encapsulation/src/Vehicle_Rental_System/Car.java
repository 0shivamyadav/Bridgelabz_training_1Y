package Vehicle_Rental_System;

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(int vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.10;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Policy: " + policyNumber);
    }
}