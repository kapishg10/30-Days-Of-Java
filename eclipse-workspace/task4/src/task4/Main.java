package task4;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerImplementation customerFunction =new CustomerImplementation();
		//getAllCustomers
		System.out.println("All Customers List");
	      for (Customer customer1 : customerFunction.getAllCustomers()) {
		         System.out.println("Customer: [Id : " + customer1.getCustomerId() + ", Name : " + customer1.getCustomerName()+" ]");
		      }
		//getAllOrders
	      System.out.println("All Orders List");
		for (Customer customer : customerFunction.getAllOrders()) {
	         System.out.println("Customer: [Name : " + customer.getCustomerName() + ", Order : "+ customer.getCustomerOrder() +" ]");
	      }
		//updateCustomer
		Customer customer = customerFunction.getAllCustomers().get(1);
	      customer.setCustomerName("Mannan");
	      customerFunction.updateCustomer(customer);
		
	      for (Customer customer1 : customerFunction.getAllOrders()) {
		         System.out.println("Customer: [Id : " + customer1.getCustomerId() + ", Name : " + customer1.getCustomerName() + ", Order : "+ customer1.getCustomerOrder() +" ]");
		      }
	      //changeOrder
	      Customer customer2 = customerFunction.getAllCustomers().get(0);
	      customer2.setCustomerOrder("Battery");
	      customerFunction.changeOrder(customer2);
		
	      for (Customer customer3 : customerFunction.getAllOrders()) {
		         System.out.println("Customer: [Id : " + customer3.getCustomerId() + ", Name : " + customer3.getCustomerName() + ", Order : "+ customer3.getCustomerOrder() +" ]");
		      }
	      //deleteCustomer
	      Customer customer_ = customerFunction.getAllCustomers().get(3);
	      customerFunction.deleteCustomer(customer_);
	      
	      for (Customer customer4 : customerFunction.getAllCustomers()) {
		         System.out.println("Customer: [Id : " + customer4.getCustomerId() + ", Name : " + customer4.getCustomerName() + ", Order : "+ customer4.getCustomerOrder() +" ]");
		      }
	      
	     //orderFulfilled
	}

}
