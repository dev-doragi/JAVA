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
		iMethod(); // �ν��Ͻ� �޼��� ȣ��
		sMethod(); // ���� �޼��� ȣ��
	}
	
	public static void staticMethod() {
		//iMethod();
		sMethod();
	}
}

public class MethodExam3 {

	public static void main(String[] args) {
		Number2.staticMethod(); // static�� �ʱⰪ�� �ִ�.
		
		Number2 num = new Number2();
		num.instanceMethod(); // �ν��Ͻ� �޼��� ȣ��
	}
}
