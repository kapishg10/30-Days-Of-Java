package task4;

import java.util.List;

class interface CustomerFunction {
	
	public List<Customer> getAllCutomers();
	public List<Customer> getAllOrders();
	public Customer getCustomer(int customerId);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public void changeOrder(Customer customer);
	public boolean orderFulfilled(boolean order);
}
