package sec01.exam04;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("손흥민", "이강인", "이민호", "김진아", "손흥민", "손기정");
		//스트림 얻기
		names.stream()
			.distinct()//중복 제거
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//스트림 얻기
		names.stream()
			.filter(n -> n.startsWith("이"))//필터링("이"로 시작하는 요소만 필터링)
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//스트림 얻기
		names.stream()
			.distinct()//중복 제거
			.filter(n -> n.startsWith("손"))//필터링("손"으로 시작하는 요소만 필터링)
			.forEach(n -> System.out.println(n));		
	}//end of main
}

