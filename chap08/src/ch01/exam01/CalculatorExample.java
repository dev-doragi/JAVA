package ch01.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// CompleteCalc 객체 생성
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println();
		
		calc.showInfo();
		System.out.println();
		calc.description();		// 디폴트 메소드 호출
		System.out.println();
		
		int[] arr = { 1, 2, 3, 4, 5 }; 
		System.out.println(Calc.total(arr)); 		// Calc 인터페이스의  static 메서드 total 호출
		
	}
}
