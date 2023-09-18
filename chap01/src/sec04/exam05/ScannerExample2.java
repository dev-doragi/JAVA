package sec04.exam05;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) throws Exception {
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수: ");
		String strNum2 = scanner.nextLine();
		
		// 입력받은 문자열(숫자)을 정수로 변환(기본 자료형을 변환)
		int num1 = Integer.parseInt(strNum1); 
		int num2 = Integer.parseInt(strNum2); 
		
		// 입력받은 문자열(숫자)을 정수로 변환(Integer 객체로 변환)
		// int num2 = Integer.valueOf(strNum2); // 클래스 타입(Integer)을 원시 타입으로 변환(unBoxing)
		
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
	} // end of main
	
}
