package sec01.exam00.abstraction;

// 추상화 예제(Abstraction)
/* 인터페이스란
 *  추상 메서드나 상수를 통해서 어떤 객체가 수행해야 하는 핵심적인 기능(역할)만을 규정해두고,
 *  실제적인 구현은 해당 인터페이스를 구현하는 각각의 객체들에서 하도록 프로그램을 설계하는 것 */
public interface Vehicle {
	// 추상 메서드(미완성 메서드)
	public abstract void start(); 
	public abstract void moveForward();
	public abstract void moveBackward();
	public abstract void stop();
}
