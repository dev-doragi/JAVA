package sec05.exam02;

class Number {
	int num; // �ν��Ͻ� �ʵ�
	static double num2; // Ŭ���� �ʵ�
	
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
		Number.staticMethod(); // ���� �޼��� ȣ��

		Number num = new Number();
		num.instanceMethod(); // �ν��Ͻ� �޼��� ȣ��
	}

}
