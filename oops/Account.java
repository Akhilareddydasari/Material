package oops;

public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double checkBalance() {
        return balance;
    }

    public void transfer(Account target, double amount) {
        if (this.balance >= amount) {
            this.withdraw(amount);
            target.deposit(amount);
        } else {
            System.out.println("Insufficient balance to transfer.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}