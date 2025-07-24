package oops;

public class Customer {
    private String customerId;
    private String name;
    private Account account1; // supports max 2 accounts without List
    private Account account2;

    public Customer(String id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void addAccount(Account account) {
        if (account1 == null) {
            account1 = account;
        } else if (account2 == null) {
            account2 = account;
        } else {
            System.out.println("Customer can have only two accounts.");
        }
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Account getAccount1() {
        return account1;
    }

    public Account getAccount2() {
        return account2;
    }
}