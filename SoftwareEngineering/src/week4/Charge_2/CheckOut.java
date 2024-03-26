package week4.Charge_2;

public class CheckOut {
	private DiscountStrategy discountStrategy;
	private double charge;
	
	public CheckOut(DiscountStrategy discountStrategy, double charge) {
		this.discountStrategy = discountStrategy;
		this.charge = charge;
	}
	
	public void ApplyDiscount() {
		System.out.println("원가: " + this.charge + "원");
		double discountedCharge = discountStrategy.Discount(this.charge);
		System.out.println("할인가: " + discountedCharge + "원");
	}
}
