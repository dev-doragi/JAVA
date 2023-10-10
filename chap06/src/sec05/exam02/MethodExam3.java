package sec05.exam02;

class Number2 {
	int num; 
	static double num2;
	
	public void iMethod() {
		System.out.println(num);
		System.out.println(num2);
	}
	
	public static void sMethod() {
		//System.out.println(num1); // non-static field num1
		System.out.println(num2);
	}
	
	public void instanceMethod() {
		iMethod(); // 인스턴스 메서드 호출
		sMethod(); // 정적 메서드 호출
	}
	
	public static void staticMethod() {
		//iMethod();
		sMethod();
	}
}

public class MethodExam3 {

	public static void main(String[] args) {
		Number2.staticMethod(); // static은 초기값이 있다.
		
		Number2 num = new Number2();
		num.instanceMethod(); // 인스턴스 메서드 호출
	}
}
