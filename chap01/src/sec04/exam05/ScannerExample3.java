package sec04.exam05;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) throws Exception {
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 생년월일: ");
		String birthDate = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 생년월일: " + birthDate);
		System.out.println("3. 전화번호: " + tel);
	}
}
