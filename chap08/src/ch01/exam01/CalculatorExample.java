package ch01.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// CompleteCalc ��ü ����
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println();
		
		calc.showInfo();
		System.out.println();
		calc.description();		// ����Ʈ �޼ҵ� ȣ��
		System.out.println();
		
		int[] arr = { 1, 2, 3, 4, 5 }; 
		System.out.println(Calc.total(arr)); 		// Calc �������̽���  static �޼��� total ȣ��
		
	}
}
