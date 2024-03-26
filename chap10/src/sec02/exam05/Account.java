package sec02.exam05;

public class Account {
	private long balance;
	
	public Account() { }

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	/* JVM은 프로그램 실행 중 예외가 발생하면 해당 예외 클래스로 예외 객체를 생성
	 * 그러나 사용자 정의 예외는 개발자가 직접 예외를 생성시켜야 함
	 * 따라서 잔고가 부족하면 OutOfBalanceException예외가 발생시킴 */
	
	public void withdraw(int money) throws OutOfBalanceException {
		System.out.println("예금액: " + getBalance() + ", 출금 요청액: " + money);
		
		if (balance < money) {
			throw new OutOfBalanceException("잔고부족(예외발생): " + (money - balance) + "원이 부족합니다.");
		}
		
		balance -= money;
	}
	

}
