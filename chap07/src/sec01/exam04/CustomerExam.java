package sec01.exam04;

public class CustomerExam {

	public static void main(String[] args) {
		
		SILVERCustomer customer_1 = new SILVERCustomer();
		customer_1.setCustomerID(1001);
		customer_1.setCustomerName("º’»ÔπŒ");
		customer_1.calcMileagePoint(100000);
		System.out.println(customer_1.customerInfo());
		//System.out.println((customer_1.customerInfo()).length() / 5 + "\n");
		
		VIPCustomer customer_2 = new VIPCustomer();
		customer_2.setCustomerID(1002);
		customer_2.setCustomerName("¿Ã∞≠¿Œ");
		customer_2.setSpecialMP(10000);
		customer_2.calcMileagePoint(200000);
		System.out.println(customer_2.customerInfo());

	}

}
