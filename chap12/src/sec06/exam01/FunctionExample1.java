package sec06.exam01;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	public static void main(String[] args) {
		/* 문자열(String)을 매개변수로 받아 Integer 객체로 매핑하여 리턴하는
		 * Function 인터페이스를 람다식으로 구현 */
		Function<String, Integer> func = (s) -> {
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};
		int wordCnt = func.apply("자바는 객체지향 언어이다");
		System.out.println("단어 수 : " + wordCnt);
		
	    // Integer형을 String으로 타입 변환하는 Function 인터페이스를 람다식으로 구현
	    Function<Integer, String> intToStr = t -> String.valueOf(t);
	    String str = intToStr.apply(100);
	    System.out.println("문자열: " + str);

	    // String을 Integer형으로 타입 변환하는 함수 정의
	    ToIntFunction<String> strToInt = t -> Integer.parseInt(t);
	    int num = strToInt.applyAsInt("100");
	    System.out.println("정수: " + num);
	}//end of main
}

