package sec02.exam05;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		// ����
		account.deposit(100000);
		
		// ���
		/*  */
		try {
			account.withdraw(50000);
			account.withdraw(100000); // �ܰ���� ���� �߻�
		} catch (OutOfBalanceException e) {
			
			// Throwable Ŭ������ getMessage() ȣ���Ͽ� detailMessage �ʵ��� �޼����� ������
			System.out.println(e.getMessage());
			System.out.println();
			
			// Throwable Ŭ������ toString() ȣ���Ͽ� ���� �޽����� ������
			System.out.println(e.toString());
			System.out.println();
			
			// �� ���� ������ ������
			System.out.println("�� ���� ����: ");
			e.printStackTrace();
		} finally {
			System.out.println("��� �����մϴ�.");
		}

	}

}
