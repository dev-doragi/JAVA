package sec01.exam00.polymorphism;

public class Car implements Vehicle{ 
	// implements -> Vehicle이라는 인터페이스를 구현

	@Override
	public void start() {
		System.out.println("자동차 를! 지금 출발합니다!");
	}

	@Override
	public void moveForward() {
		System.out.println("자동차가 앞으로 전진합니다.");
	}

	@Override
	public void moveBackward() {
		System.out.println("자동차가 앞으로 후진합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차 를! 정지합니다");
	} 
}