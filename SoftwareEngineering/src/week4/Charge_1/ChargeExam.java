package week4.Charge_1;

public class ChargeExam {
	public static void main(String[] args) {
		CheckOut familyCharge = new CheckOut("FAMILY", 50000);
		familyCharge.applyDiscount();
		
		System.out.println();
		
		CheckOut vipCharge = new CheckOut("VIP", 50000);
		vipCharge.applyDiscount();
	}
}
