package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L; // long
		
		/*자바 컴파일러는 정수 리터럴을 int 타입으로 간주하기 때문에
		 * int 타입의 허용범위를 초과하면 long 타입임을 컴파일러에게 
		 * 알려주어야함(리터럴 뒤에 "L"붙임)
		 * */
		// long var3 = 10000000000; // out of range
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		// System.out.println(var3);
		System.out.println(var4);
	} // end of main	
} // end of class
