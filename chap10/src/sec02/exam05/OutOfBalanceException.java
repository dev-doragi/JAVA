package sec02.exam05;

/* 사용자 정의 잔고부족 예외 클래스 선언
 * 예외 종류에 따라 일반 예외 또는 실행 예외를 상속 */
public class OutOfBalanceException extends Exception {
	
	// 생성자
	public OutOfBalanceException() { }
	
	// 예외 객체를 만들기 위한 생성자	
	public OutOfBalanceException(String message) {
		super(message); // Throwable 클래스의 detailMessage 필드에 message가 할당됨
	}
}
