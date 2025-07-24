package oops;

public class BankBranch {
    private Customer customer1; // max 2 customers for simplicity
    private Customer customer2;

    public BankBranch(String id, String name) {
		// TODO Auto-generated constructor stub
	}

	public void addCustomer(Customer customer) {
        if (customer1 == null) {
            customer1 = customer;
        } else if (customer2 == null) {
            customer2 = customer;
        } else {
            System.out.println("Branch full. Can't add more customers.");
        }
    }

	//public void addCustomer1(Customer c1) {
		// TODO Auto-generated method stub
		
	//}
}