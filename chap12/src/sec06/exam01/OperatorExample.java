package sec06.exam01;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 97, 85, 95 };
	
	/* IntBinaryOperator: int 타입의 매개값 2개를 받아, 연산 후 int로 리턴
	 * - applyAsInt(result, score): 두 개의 int를 매개변수로 받아 연산 후 int로 반환하는 메서드
	 */
	//IntBinaryOperator 함수형 인터페이스의 구현 객체를 매개변수를 받아 최대값/최소값을 구하는 메소드
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];//97
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		/* IntBinaryOperator 구현객체를 생성하는 람다식 작성*/
		//최대값 얻기
		int max = maxOrMin(
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
	}//end of main
}
