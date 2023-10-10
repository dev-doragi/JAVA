package sec01.exam03;

public class CustomerExam {

	public static void main(String[] args) {
		Customer customer_1 = new Customer(1001, "º’»ÔπŒ");
		customer_1.calcMileagePoint(10000);
		
		Customer customer_2 = new Customer(1002, "¿Ã∞≠¿Œ");
		customer_2.calcMileagePoint(20000);
		
		System.out.println(customer_1.customerInfo());

	}

}
