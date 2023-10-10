package sec04.exam03;

public class Car {
	// 필드
	private int gas;
	
	// 생성자
	
	// 메서드
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.\n");
			return false;
		}
		System.out.println("gas가 있습니다.\n");
		return true; 
	}

	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("주행중...      (gas 잔량: " + this.getGas() + ")");
				gas--;
			} else {
				System.out.println("정지합니다. (gas 잔량: " + this.getGas() + ")\n");
				return;
			}
		}
	}
}
