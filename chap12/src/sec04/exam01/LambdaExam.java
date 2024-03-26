package sec04.exam01;

//함수형 인터페이스
@FunctionalInterface
interface Calculable {
	int calculate(int x, int y); // 추상 메서드 calculate
}

//실행 클래스
public class LambdaExam {
	public static void main(String[] args) {
		//함수형 인터페이스 타입 참조변수
		Calculable calc;
		
		//Calculable 인터페이스를 익명 구현 객체로 구현
		calc = new Calculable() {
			@Override
			public int calculate(int x, int y) {
				return x + y;
			}
		};
		System.out.println(calc.calculate(100,  50));		
		
		//Calculable 인터페이스를 똑같이 람다식으로 구현
		calc = (int x, int y) -> {
				return x + y;
		};
		System.out.println(calc.calculate(100, 50));
		
		/* Calculable 인터페이스를 람다식으로 구현(간략화)
		 * - 매개변수의 타입은 추론 가능함으로 생략 가능 
		 * - 앞에서 미리 선언했기 때문에 타입을 붙일 필요 X */
		calc = (x, y) -> {
				return x + y;
		};
		System.out.println(calc.calculate(100, 50));
		
		/* Calculable 인터페이스를 람다식으로 구현(간략화-2)
		 * - return문은 실행문이 1개일 때 {}과 함께 생략 가능 */
		calc = (x, y) -> x + y;
		System.out.println(calc.calculate(100, 50));
		System.out.println("----------");
		
		System.out.println("더하기");
		calc = (x, y) -> x + y;		
		action(calc);
		
		System.out.println("빼기");
		calc = (x, y) -> x - y;
		action(calc);
		
		System.out.println("곱하기");
		calc = (x, y) -> x * y;
		action(calc);
		
		System.out.println("나누기");
		calc = (x, y) -> x / y;
		action(calc);
	}//end of main()
	//action 정적 메서드
	public static void action(Calculable c) {
		int x = 100;
		int y = 50;
		
		System.out.println(c.calculate(x, y));
	}//end of action()
}//end of class
