package task4;

class Customer {
	
	   private String customerName;
	   private int customerID;
	   private String customerAddress;
	   private String customerPhoneNumber;
	   private String customerOrder;
	   private boolean orderFulfilled=false;

	   Customer(String customerName, int customerID, String customerOrder,boolean orderFulfilled){
	      this.customerName = customerName;
	      this.customerID = customerID;
	      this.customerOrder = customerOrder;
	      this.orderFulfilled = orderFulfilled;
	   }

	   public String getCustomerName() {
	      return customerName;
	   }

	   public void setCustomerName(String customerName) {
	      this.customerName = customerName;
	   }

	   public int getCustomerId() {
	      return customerID;
	   }

	   public void setCustomerID(int customerID) {
	      this.customerID = customerID;
	   }
	   
	   public String getCustomerAddress() {
		   return customerAddress;
	   }

	   public void setCustomerAddress(String customerAddress) {
		   this.customerAddress = customerAddress;
	   }
		   
	   public String getCustomerPhoneNumber() {
		   return customerPhoneNumber;
	   }

	   public void setCustomerPhoneNumber(String customerPhoneNumber) {
		   this.customerPhoneNumber = customerPhoneNumber;
	   }
			   
	   public String getCustomerOrder() {
		   return customerOrder;
	   }

	   public void setCustomerOrder(String customerOrder) {
		   this.customerOrder = customerOrder;
	   }
	   
	   public boolean getOrderFulfilled() {
		      return orderFulfilled;
		   }

		   public void setOrderFulfilled(boolean orderFulfilled) {
		      this.orderFulfilled = orderFulfilled;
		   }
}
