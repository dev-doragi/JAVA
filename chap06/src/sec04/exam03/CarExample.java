package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다!");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas가 남아있습니다. (gas 잔량: " + myCar.getGas() + ")");
		} else {
			System.out.println("gas를 주입해주세요. (gas 잔량: " + myCar.getGas() + ")");
		}

	}

}
