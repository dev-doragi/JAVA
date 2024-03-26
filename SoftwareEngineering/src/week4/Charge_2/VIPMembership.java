package week4.Charge_2;

public class VIPMembership implements DiscountStrategy{

	@Override
	public double Discount(double charge) {
		return charge * 0.8;
	}

}
