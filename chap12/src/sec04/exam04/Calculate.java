package sec04.exam04;

//Calculable 인터페이스 구현 객체를 매개변수로 받아 연산
public class Calculate {
	public void action(Calculable c) {
		double result = c.calc(10.0, 5.0);
		System.out.println("result: " + result);
	}	
}


