package sec01.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		//Student 클래스 선언시 Comparable<Student> 구현
		List<Student> studentList = Arrays.asList(
			new Student("손흥민", 95),
			new Student("이강인", 97),
			new Student("황희찬", 93)
		);
		
		//기본 정렬
		studentList.stream()
			.sorted()//올림차순 정렬
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		//기본 정렬의 반대로 정렬(내림차순 정렬)
		studentList.stream()
		.sorted(Comparator.reverseOrder() )//내림차순 정렬을 위해 매개값에 Comparator 지정) 
		.forEach(s -> System.out.print(s.getScore() + ","));	
	}//end of main	
}


