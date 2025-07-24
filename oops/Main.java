package oops;

public class Main {
    public static void main(String[] args) {
        BankBranch branch = new BankBranch("B001", "Main Branch");

        Customer c1 = new Customer("C001", "Akhila");
        branch.addCustomer(c1);

        SavingsAccount sa = new SavingsAccount("S001", 5000.0);
        CurrentAccount ca = new CurrentAccount("C002", 2000.0);

        c1.addAccount(sa);
        c1.addAccount(ca);

        System.out.println("Depositing Rs.2000 to Savings Account");
        sa.deposit(2000);
        System.out.println("Savings Balance: " + sa.checkBalance());

        System.out.println("Withdrawing Rs.2500 from Current Account");
        ca.withdraw(2500);
        System.out.println("Current Balance: " + ca.checkBalance());

        System.out.println("Transferring Rs.1000 from Savings to Current");
        sa.transfer(ca, 1000);
        System.out.println("Savings Balance: " + sa.checkBalance());
        System.out.println("Current Balance: " + ca.checkBalance());
    }
}