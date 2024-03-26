package week4.Charge_2;

public class CheckOut {
	private DiscountStrategy discountStrategy;
	private double charge;
	
	public CheckOut(DiscountStrategy discountStrategy, double charge) {
		this.discountStrategy = discountStrategy;
		this.charge = charge;
	}
	
	public void ApplyDiscount() {
		System.out.println("����: " + this.charge + "��");
		double discountedCharge = discountStrategy.Discount(this.charge);
		System.out.println("���ΰ�: " + discountedCharge + "��");
	}
}
