package sec03.exam04;

public class DoubleOperationExample {
	public static void main(String[] args) {
		// 피연산자 중 크기가 큰 타입으로 자동 타입 변환
		int intValue = 10;
		double doubleValue = 5.5;
		
		double result = intValue + doubleValue;
		System.out.println("result1: " + result);
		
		// int 타입으로 계산결과를 얻고 싶으면 double 타입 변수를 int 캐스팅 후 연산
		int result2 = intValue + (int) doubleValue;
		System.out.println("result2: " + result2);		
	}
}
