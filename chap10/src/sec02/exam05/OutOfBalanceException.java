package sec02.exam05;

/* ����� ���� �ܰ���� ���� Ŭ���� ����
 * ���� ������ ���� �Ϲ� ���� �Ǵ� ���� ���ܸ� ��� */
public class OutOfBalanceException extends Exception {
	
	// ������
	public OutOfBalanceException() { }
	
	// ���� ��ü�� ����� ���� ������	
	public OutOfBalanceException(String message) {
		super(message); // Throwable Ŭ������ detailMessage �ʵ忡 message�� �Ҵ��
	}
}
