package sec03.exam03;

public class ByteOperataionExample {

	public static void main(String[] args) {
		/* �ڹٿ��� ���� ���ͷ��� �����ϴ� ���,
		 * �����Ϸ��� ������ �ܰ迡�� ���� ����� ������ ���� Ÿ������
		 * ���� ���ͷ��� ��ȯ�Ͽ� ���� ����(�����Ϸ��� ���� ����)
		 */
		byte result1 = 10 + 20; // byte + byte
		System.out.println(result1);
		
		/* ���� ���ͷ��� ������ ����� ����
		 * �����ϵ� ����Ʈ �ڵ带 ������ JVM�� ���� ����
		 * ����� JVM�� ���� x, y�� Ÿ���� int�� Ÿ�� ��ȯ �� ���� ����
		 */
		byte x = 10;
		byte y = 20;
		int result2 = x + y; // int + int
		System.out.println(result2);
	} // end of main
} // end of class
