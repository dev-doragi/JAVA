package sec01.exam00.inheritance;

/* 상속(Inheritance)
 * - 상속이란 기존의 클래스를 재활용하여 새로운 클래스를 작성(확장)하는 자바의 문법 요소
 * - 상속은 클래스 간 공유될 수 있는 속성과 기능들을 상위 클래스로 추상화시켜 
 *   해당 상위 클래스로부터 확장된 여러 개의 하위 클래스들이 모두 상위 클래스의 속성과 기능들을 사용 가능
 * - 클래스들 간 공유하는 속성과 기능들을 간편하게 재사용할 수 있어 반복적인 코드를 최소화
 */
/* Car/MotorBike의 공통적인 속성과 기능을 추상화하여 Vehicle 클래스(상위 클래스) 선언 */

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