package sec01.exam10;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		// studentList 컬렉션 생성
		List<Student> studentList = Arrays.asList(
			new Student("손흥민", 99),
			new Student("이강인", 97),
			new Student("김민재", 98)
		);
		
		//오리지널 스트림 참조 
		int sum1 = studentList.stream()
			//.mapToInt(Student :: getScore)
			.mapToInt(s -> s.getScore())
			.sum();//sum() 기본집계 메서드로 합을 계산 
		
		int sum2 = studentList.stream()
			.mapToInt(Student :: getScore)
			//점수를 매개변수(기본값, (a, b) -> { })로 받아서 합 계산(요소 수 만큼 반복)
			.reduce(0, (a, b) -> a+b);//집계 메서드
	
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}
