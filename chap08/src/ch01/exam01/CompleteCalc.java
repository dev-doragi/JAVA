package ch01.exam01;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) 
			return num1 / num2;
		else 
			return Calc.ERROR;
	}

	@Override
	public void description() {
		System.out.println("정수 계산기를 새롭게 구현하겠습니다!!!???");
		//super.myMethod(); // private 메서드라서 다른 클래스에서 접근 불가
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}
	
}
