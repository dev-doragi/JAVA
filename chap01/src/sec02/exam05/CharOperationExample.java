package sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char) (c2 + 1); // char 변수가 산술 연산에 사용되면 int로 형변환 되므로 연산결과는 int
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}
}
