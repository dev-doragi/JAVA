package sec02.exam05;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금
		account.deposit(100000);
		
		// 출금
		/*  */
		try {
			account.withdraw(50000);
			account.withdraw(100000); // 잔고부족 예외 발생
		} catch (OutOfBalanceException e) {
			
			// Throwable 클래스의 getMessage() 호출하여 detailMessage 필드의 메세지를 가져옴
			System.out.println(e.getMessage());
			System.out.println();
			
			// Throwable 클래스의 toString() 호출하여 예외 메시지를 가져옴
			System.out.println(e.toString());
			System.out.println();
			
			// 상세 예외 정보를 가져옴
			System.out.println("상세 예외 정보: ");
			e.printStackTrace();
		} finally {
			System.out.println("장비를 정지합니다.");
		}

	}

}
