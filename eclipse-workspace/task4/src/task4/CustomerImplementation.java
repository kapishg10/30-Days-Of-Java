package task4;

import java.util.ArrayList;
import java.util.List;

class CustomerImplementation implements CustomerFunction {
	
	List<Customer> customers;
	
	public CustomerImplementation() {
		
		customers = new ArrayList<Customer>();
		   Customer customer1 = new Customer("Kapish",0,"Mobile",true);
		   Customer customer2 = new Customer("Kashish",1,"Laptop",false);
		   Customer customer3 = new Customer("Bhavika",2,"TV",true);
		   Customer customer4 = new Customer("Riyansh",3,"Computer",true);
		   customers.add(customer1);
		   customers.add(customer2);
		   customers.add(customer3);
		   customers.add(customer4);
	}
	//deleteCustomer
	public void deleteCustomer(Customer customer) {
		   customers.remove(customer.getCustomerId()).getCustomerName();
	      System.out.println("Customer: Id " + customer.getCustomerId() + ", deleted from database");
	   }
	//updateCustomer
	public void updateCustomer(Customer customer) {
	      customers.get(customer.getCustomerId()).setCustomerName(customer.getCustomerName());
	      System.out.println("Customerr: Id " + customer.getCustomerId() + ", updated in the database");
	   }
	//getAllOrders
	public List<Customer> getAllOrders() {
	      return customers;
	   }
	//getAllCustomers
	public List<Customer> getAllCustomers() {
	      return customers;
	   }
	//changeOrder
	public void changeOrder(Customer customer) {
	      customers.get(customer.getCustomerId()).setCustomerOrder(customer.getCustomerOrder());
	      System.out.println("Customer: Order " + customer.getCustomerOrder() + ", changed in the database");
	   }
	//orderFulfilled
//	public boolean orderFulfilled(boolean order) {
//		customers.get()
//		return order;
//		
//	}
	public boolean orderFulfilled(int i) {
		if(((Customer) customers).getOrderFulfilled()== true) {
	      return true ;
	   }
		else {
			return false;
		}

}
	@Override
	public List<Customer> getAllCutomers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean orderFulfilled(boolean order) {
		// TODO Auto-generated method stub
		return false;
	}
}