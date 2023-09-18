package sec02.exam10;

import java.util.Scanner;

public class ConstExample2 {
	public static void main(String[] args) {
		final int CLASS_CNT = 3;
		
		Scanner in = new Scanner(System.in);
				
		System.out.println("성적입력");
		System.out.println("=========");
		System.out.print("자바: ");
		double s1 = in.nextDouble();
		System.out.print("데이터베이스: ");
		double s2 = in.nextDouble();
		System.out.print("웹프로그래밍: ");
		double s3 = in.nextDouble();
		System.out.println("=========");
		
		double sum = s1 + s2 + s3;
		System.out.println("총점: " + sum);
		
		double avg = sum / CLASS_CNT;
		System.out.println("평균: " + avg);		
	}
}
