package sec02.exam10;

import java.util.Scanner;

public class ConstExample2 {
	public static void main(String[] args) {
		final int CLASS_CNT = 3;
		
		Scanner in = new Scanner(System.in);
				
		System.out.println("�����Է�");
		System.out.println("=========");
		System.out.print("�ڹ�: ");
		double s1 = in.nextDouble();
		System.out.print("�����ͺ��̽�: ");
		double s2 = in.nextDouble();
		System.out.print("�����α׷���: ");
		double s3 = in.nextDouble();
		System.out.println("=========");
		
		double sum = s1 + s2 + s3;
		System.out.println("����: " + sum);
		
		double avg = sum / CLASS_CNT;
		System.out.println("���: " + avg);		
	}
}
