package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�!");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� �����ֽ��ϴ�. (gas �ܷ�: " + myCar.getGas() + ")");
		} else {
			System.out.println("gas�� �������ּ���. (gas �ܷ�: " + myCar.getGas() + ")");
		}

	}

}
