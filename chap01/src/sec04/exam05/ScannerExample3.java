package sec04.exam05;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) throws Exception {
		// Scanner ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[�ʼ� ���� �Է�]");
		
		System.out.print("1. �̸�: ");
		String name = scanner.nextLine();
		
		System.out.print("2. �������: ");
		String birthDate = scanner.nextLine();
		
		System.out.print("3. ��ȭ��ȣ: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[�Էµ� ����]");
		System.out.println("1. �̸�: " + name);
		System.out.println("2. �������: " + birthDate);
		System.out.println("3. ��ȭ��ȣ: " + tel);
	}
}
