package oops;

public class SavingsAccount extends Account {

    public SavingsAccount(String accNo, double initialBalance) {
        super(accNo, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}