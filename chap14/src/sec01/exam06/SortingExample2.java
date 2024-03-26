package sec01.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExample2 {
	public static void main(String[] args) {
		//Student 클래스 선언시 Comparable<Student> 구현
		List<Student> sList = Arrays.asList(
			new Student("손흥민", 95),
			new Student("이강인", 97),
			new Student("황희찬", 93)
		);
		
		//기본 정렬
		/* Comparable 인터페이스를 구현하지 않았으면
		 * sort() 메소드의 매개값으로 비교자(Comparator)를 람다식으로 제공해야 함
		 */
		sList.stream()
			.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s -> System.out.println(s.getName() + ":" +s.getScore()));
		System.out.println();
		
		//기본 정렬의 반대로 정렬(내림차순 정렬)
		sList.stream()
		.sorted(Comparator.reverseOrder() )//내림차순 정렬을 위해 매개값에 Comparator 지정 
		.forEach(s -> System.out.println(s.getName() + ":" +s.getScore()));	
	}//end of main	
}



