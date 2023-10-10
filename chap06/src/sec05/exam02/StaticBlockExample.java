package sec05.exam02;

public class StaticBlockExample {
	int i;
	static String info;
	
	void iMethod() {
		System.out.println("iMethod() 호출");
	}
	
	static void sMethod() {
		System.out.println("sMethod() 호출");
	}
	
	// 정적 초기화 블록
	/* 클래스가 메서드 영역에 로딩될 때 자동으로 한 번만 실행하는 블록 
	 * 정적 필드의 초기화 작업과 정적 메서드 호출 작업 수행 -> main 함수보다 먼저 실행된다.*/
	static {
		//iMethod
		sMethod();
		
		//i = 100;
		info = "Static Block";
		System.out.println(info);
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
}

