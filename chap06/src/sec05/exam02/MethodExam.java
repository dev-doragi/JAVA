package sec05.exam02;

class Calc {
	int i, j;
	
	// 인스턴스 메서드
	int add() {
		return i + j;
	}
	
	// 정적 메서드
	static double add(double i, double j) {
		return i + j;
	}
} // end of Calc

public class MethodExam {
	public static void main(String[] args) {
		System.out.println(Calc.add(123.5, 456.7)); // 정적 메서드 호출
		
		Calc cc = new Calc();
		cc.i = 100;
		cc.j = 200;
		System.out.println(cc.add()); // 인스턴스 메서드 호출
	} // end of main()
} // end of MethodExam