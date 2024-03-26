package week4.Charge_2;

public class FamilyMembership implements DiscountStrategy{

	@Override
	public double Discount(double charge) {
		return charge * 0.95;
	}

}
