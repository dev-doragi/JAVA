package sec03.exam04;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		/* �ǿ����� �� ũ�Ⱑ ū Ÿ������ Ÿ�� ��ȯ
		 * int + int + long�̹Ƿ� �������� long Ÿ������ ��ȯ 
		 */
		long result = value1 + value2 + value3;
		System.out.println(result);
	}
}
