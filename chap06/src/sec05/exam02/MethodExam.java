package sec05.exam02;

class Calc {
	int i, j;
	
	// �ν��Ͻ� �޼���
	int add() {
		return i + j;
	}
	
	// ���� �޼���
	static double add(double i, double j) {
		return i + j;
	}
} // end of Calc

public class MethodExam {
	public static void main(String[] args) {
		System.out.println(Calc.add(123.5, 456.7)); // ���� �޼��� ȣ��
		
		Calc cc = new Calc();
		cc.i = 100;
		cc.j = 200;
		System.out.println(cc.add()); // �ν��Ͻ� �޼��� ȣ��
	} // end of main()
} // end of MethodExam