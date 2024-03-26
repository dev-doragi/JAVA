package sec05.exam01;

public class GenInterfaceMain {
	public static void main(String[] args) {	
		/* 제네릭 타입 함수형 인터페이스를 구현하는 람다식 선언
		 * 타입 파라미터의 구체적인 타입은 익명 구현객체의 참조변수 타입 선언시 설정
		 */
		GenInterface<String> sValue = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(sValue.getVlue("java"));
		System.out.println(sValue.getVlue("java programming"));
		System.out.println();

		GenInterface<Integer> iValue = (n) ->  n * 2;
		System.out.println(iValue.getVlue(100));
		System.out.println(iValue.getVlue(1000));
		System.out.println();
		
		GenInterface<Double> Dvalue = (n) -> n * 3.14;
		System.out.println(Dvalue.getVlue(2.5));
	}
}

