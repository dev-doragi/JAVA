package sec03.exam04;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		/* 피연산자 중 크기가 큰 타입으로 타입 변환
		 * int + int + long이므로 연산결과는 long 타입으로 변환 
		 */
		long result = value1 + value2 + value3;
		System.out.println(result);
	}
}
