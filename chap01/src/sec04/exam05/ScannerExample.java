package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		// Scanner ��ü ����
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			// ���� ���� �Է�
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			
			// �Է��� ���ڿ� inputData�� q�� ��� while�� break(���ڿ� ��)
			if (inputData.equals("q")) {
				break;
			}
		} // end of while
		
		System.out.println("����");
	} // end of main
	
}
