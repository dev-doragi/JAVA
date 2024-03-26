package sec05.exam02;

import sec04.exam04.Calculable;

//Calculable 인터페이스를 사용하는 Person 클래스
public class Person {
	//Calculable 인터페이스를 구현한 람다식을 매개변수로 받아 연산하는 메소드 
	public void action(Calculable calculable) {
		double result = calculable.calc(10.1, 5.2);
		System.out.println("result: " + result);
	}
}
