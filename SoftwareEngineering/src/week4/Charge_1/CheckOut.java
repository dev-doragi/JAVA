package week4.Charge_1;

public class CheckOut {
	
	private String memberType;
	private double charge;

	public CheckOut(String memberType, double charge) {
		this.memberType = memberType;
		this.charge = charge;
	}
	
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	public void applyDiscount() {
		System.out.println("����: " + this.charge + "��");
		double discountedCharge = 0;
		if (this.memberType.equals("FAMILY")) discountedCharge = 0.95 * this.charge;
		else if (this.memberType.equals("VIP")) discountedCharge = 0.8 * this.charge;
		System.out.println("���ΰ�: " + discountedCharge + "��");
	}
}

