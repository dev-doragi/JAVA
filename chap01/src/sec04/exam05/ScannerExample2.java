package sec04.exam05;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) throws Exception {
		// Scanner ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ��: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("�ι�° ��: ");
		String strNum2 = scanner.nextLine();
		
		// �Է¹��� ���ڿ�(����)�� ������ ��ȯ(�⺻ �ڷ����� ��ȯ)
		int num1 = Integer.parseInt(strNum1); 
		int num2 = Integer.parseInt(strNum2); 
		
		// �Է¹��� ���ڿ�(����)�� ������ ��ȯ(Integer ��ü�� ��ȯ)
		// int num2 = Integer.valueOf(strNum2); // Ŭ���� Ÿ��(Integer)�� ���� Ÿ������ ��ȯ(unBoxing)
		
		int result = num1 + num2;
		System.out.println("���� ���: " + result);
	} // end of main
	
}
