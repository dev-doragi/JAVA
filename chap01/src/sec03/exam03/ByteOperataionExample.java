package sec03.exam03;

public class ByteOperataionExample {

	public static void main(String[] args) {
		/* 자바에서 정수 리터럴을 연산하는 경우,
		 * 컴파일러는 컴파일 단계에서 연산 결과를 저장할 변수 타입으로
		 * 정수 리터럴을 변환하여 연산 수행(컴파일러가 연산 수행)
		 */
		byte result1 = 10 + 20; // byte + byte
		System.out.println(result1);
		
		/* 정수 리터럴이 변수에 저장된 경우는
		 * 컴파일된 바이트 코드를 가지고 JVM이 연산 수행
		 * 연산시 JVM은 변수 x, y의 타입을 int로 타입 변환 후 연산 수행
		 */
		byte x = 10;
		byte y = 20;
		int result2 = x + y; // int + int
		System.out.println(result2);
	} // end of main
} // end of class
