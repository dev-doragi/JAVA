package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			// 라인 단위 입력
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			
			// 입력한 문자열 inputData가 q인 경우 while문 break(문자열 비교)
			if (inputData.equals("q")) {
				break;
			}
		} // end of while
		
		System.out.println("종료");
	} // end of main
	
}
