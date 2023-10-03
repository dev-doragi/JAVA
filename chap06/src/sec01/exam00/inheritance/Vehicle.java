package sec01.exam00.inheritance;

public class Vehicle {
	String model;
	String color;
	int wheels;
	
	public void start() {
		System.out.println("지금 출발합니다!");
	}
	
	public void moveForward() {
		System.out.println("앞으로 갑니다.");
	}
	
	public void moveBackward() {
		System.out.println("뒤로 후진합니다.");
	}
	
	public void stop() {
		System.out.println("장비 를! 정지합니다.");
	}
}