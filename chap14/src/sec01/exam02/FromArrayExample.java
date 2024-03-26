package sec01.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "손흥민", "이강인", "김민재"};
		
		//배열로부터 스트림 얻기
		Stream<String> strStream = Arrays.stream(strArray);
		//Stream<String> strStream = strArray.stream();
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
	}
}
