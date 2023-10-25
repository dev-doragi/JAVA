package sec01.inheritance.abstracts;

/* 추상 클래스(추상화)
 * - 하위 클래스에서 구현할 추상적인 기능만을 정의하는 클래스,
 *    하나 이상의 추상 메서드를 가지는 클래스.
 * - 단독으로 객체를 생성할 수 없고, 하위 클래스의 부모 클래스 역할
 *    (다양한 타입을 관리하기 위한 상위 클래스 타입으로 사용)
 */

public abstract class Animal {
	// 추상 메서드
	public abstract void eat();
	public abstract void sound();
}
