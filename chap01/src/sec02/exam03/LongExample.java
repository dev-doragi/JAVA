package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L; // long
		
		/*자바 컴파일러는 정수리터럴을 int로 간주*/
		
		// long var3 = 10000000000; // out of range
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		// System.out.println(var3);
		System.out.println(var4);
	} // end of main	
} // end of class