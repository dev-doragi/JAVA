package sec05.exam04;

public class Singleton {
	/* 2) 자신의 클래스 타입으로 정적(static)필드를 선언하고 자신의 인스턴스를 생성하여 초기화
	 *  - 생성한 정적 필드를 외부에서 사용하지 못하도록 접근제한자를 private로 설정
	 */
	private static Singleton instance = new Singleton();
	
	/* 1) 생성자를 private로 선언한 이유는 외부에서 다른 Singleton 객체를 생성할 수 없도록 하려고 */
		private Singleton() {}
		
	/* 3) 유일한 인스턴스를 외부에서 사용할 수 있도록 getInstance() 선언
	 *  - 유일하게 생성한 인스턴스를 외부에서 사용할 수 있도록 반환 
	 */
		public static Singleton getInstance() {
		return instance;
	}
}
