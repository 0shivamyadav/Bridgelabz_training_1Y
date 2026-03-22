package Banking_System;

class CurrentAccount extends BankAccount implements Loanable{
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.02;
        balance += interest;
        System.out.println("Current Account Interest Added: " + interest);
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved for Current Account: " + amount);
        } else {
            System.out.println("Loan Denied for Current Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}
