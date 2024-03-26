package week4.Charge_2;

public class CheckExam {	
	public static void main(String[] args) {
		
		DiscountStrategy familyMembership = new FamilyMembership();
		CheckOut familyCharge = new CheckOut(familyMembership, 50000);
		familyCharge.ApplyDiscount();
		
		System.out.println();
		
		DiscountStrategy vipMembership = new VIPMembership();
		CheckOut vipChrge = new CheckOut(vipMembership, 50000);
		vipChrge.ApplyDiscount();		

	}

}