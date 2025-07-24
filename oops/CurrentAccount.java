package oops;

public class CurrentAccount extends Account {
    private double overdraftLimit = 1000;

    public CurrentAccount(String accNo, double initialBalance) {
        super(accNo, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }
}