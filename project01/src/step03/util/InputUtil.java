package step03.util;

import java.util.Scanner;

//사용자로부터 입력받는 작업을 진행하는 클래스
public class InputUtil {
	//scanner 필드
	private Scanner scanner;
	
	//생성자
	public InputUtil() {
		this.scanner = new Scanner(System.in);
	}

	//입력 받은 문자열을 반환하는 메소드
	public String getValue(String label) {
		System.out.print(label + ": ");//>스터디 Id (0.홈으로):
		
		//키보드로 입력한 문자열 전체(라인)를 가져오기
		String inputStr = scanner.nextLine();		
		inputStr = inputStr.trim();//CR, 공백 제거
		
		//입력값 반환
		return inputStr;
	}
}
