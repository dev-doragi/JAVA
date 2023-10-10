package sec05.exam02;

class Number {
	int num; // 인스턴스 필드
	static double num2; // 클래스 필드
	
	public void instanceMethod() {
		System.out.println(num); // OK
		System.out.println(num2); // OK
	}
	
	public static void staticMethod() {
		//System.out.println(num1); // non-static field num
		System.out.println(num2);
	}
}

public class MethodExam2 {

	public static void main(String[] args) {
		Number.staticMethod(); // 정적 메서드 호출

		Number num = new Number();
		num.instanceMethod(); // 인스턴스 메서드 호출
	}

}
