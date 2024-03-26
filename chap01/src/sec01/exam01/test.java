package sec01.exam01;

public class test {

	public static void main(String[] args) {
		int int1 = 10;
		int int2 = 4;
		char text1 = '¾Æ';
		
		int result1 = int1 / int2;
		System.out.println(result1);
		double result2 = int1 / int2;
		System.out.println(result2);
		System.out.println(text1);
		
		
		double result3 = (double) int1 / int2;
		double result4 = int1 / (double) int2;
		
		System.out.println(result3);
		System.out.println(result4);
	}
}
