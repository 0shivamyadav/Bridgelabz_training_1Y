package Banking_System;

class SavingsAccount extends BankAccount implements Loanable{
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04;
        balance += interest;
        System.out.println("Savings Interest Added: " + interest);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved for Savings Account: " + amount);
        } else {
            System.out.println("Loan Denied for Savings Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 5000;
    }
}
