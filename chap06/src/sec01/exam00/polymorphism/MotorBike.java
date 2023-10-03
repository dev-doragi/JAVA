package sec01.exam00.polymorphism;

public class MotorBike implements Vehicle {

	@Override
	public void start() {
		System.out.println("오토바이 를! 지금 출발합니다!");
	}

	@Override
	public void moveForward() {
		System.out.println("오토바이가 뒤로 후진합니다.");
	}

	@Override
	public void moveBackward() {
		System.out.println("오토바이가 뒤로 후진합니다.");
	}

	@Override
	public void stop() {
		System.out.println("오토바이 를! 정지합니다.");
	}
	
}
