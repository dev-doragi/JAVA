package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperationExample {
	public static void main(String[] args) throws Exception {
		Scanner s1 = new Scanner(System.in);
		System.out.printf("점수를 입력하세요: ");
		String strScore = s1.nextLine();
		
		int score = Integer.parseInt(strScore);
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
