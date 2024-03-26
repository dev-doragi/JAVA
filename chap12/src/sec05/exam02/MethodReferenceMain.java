package sec05.exam02;

public class MethodReferenceMain {
	public static void main(String[] args) {
		Person person = new Person();
		
		/* :: 참조 메서드 활용하기 1. 정적 메소드일 경우 static */

		/* 람다식
		 * person.action()에 계산을 위한 람다식을 매개변수로 전달
		 * - 계산은 Calculate.sAdd() 메소드에서 실행하여 반환		 */
		person.action( (x, y) -> {
			return Calculate.sAdd(x, y);
		});		
		//람다식 간소화
		person.action( (x, y) -> Calculate.sAdd(x, y));
		
		/* 정적 메소드 참조
		 * - 매개변수 2개를 받아 Calculate.sAdd() 메소드에 계산하여 리턴
		 * - 매개변수를 받아 계산하여 반환하는 단순한 람다식은 간단하게 메소드 참조로 구현
		 * - 메소드 참조 ==> 클래스명::메소드명; */
		person.action( Calculate::sAdd );		
		System.out.println("========");
		
		/* 2. 인스턴스 메소드일 경우 */
		//Calculate 객체 생성
		Calculate calculate = new Calculate();
		
		//람다식
		person.action( (x, y) -> {
			return calculate.iMul(x, y);
		});		
		//람다식 간소화
		person.action( (x, y) -> calculate.iMul(x, y));
		
		/* 인스턴스 메소드 참조
		 * - 메소드 참조 ==> 참조변수명::메소드명; -> 일반 클래스이기 때문에 객체를 생성하고
		 * 그 객체에 참조하여 멤버 메서드를 호출하도록 한다.	 */
		person.action( calculate::iMul );
		
	}//end of main
}//end of class


