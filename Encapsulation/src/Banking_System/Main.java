package Banking_System;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(101, "Alice", 6000);
        BankAccount acc2 = new CurrentAccount(102, "Bob", 15000);

        acc1.deposit(1000);
        acc1.calculateInterest();
        acc1.displayDetails();

        System.out.println("---------------------");

        acc2.withdraw(2000);
        acc2.calculateInterest();
        acc2.displayDetails();

        System.out.println("---------------------");

        Loanable loan1 = (Loanable) acc1;
        loan1.applyForLoan(5000);

        Loanable loan2 = (Loanable) acc2;
        loan2.applyForLoan(10000);
    }
}