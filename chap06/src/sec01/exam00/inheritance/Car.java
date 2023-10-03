package sec01.exam00.inheritance;

public class Car extends Vehicle {

	boolean isConvertible;
	
	void openWindow() {
		System.out.println("자동차의 모든 창문을 엽니다.");
	}

	@Override
	public void start() {
		System.out.println("자동차가 지금 출발합니다!");
	}

	@Override
	public void moveForward() {
		System.out.println("자동차가 뒤로 후진합니다.");
	}

	@Override
	public void moveBackward() {
		System.out.println("자동차가 뒤로 후진합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 를! 정지합니다.");
	}
	
}
