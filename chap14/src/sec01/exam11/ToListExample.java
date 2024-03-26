package sec01.exam11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		//list 컬렉션 생성
		List<Student> list = Arrays.asList(
				new Student("손흥민", 98, Student.Sex.MALE),
				new Student("아이유", 96, Student.Sex.FEMALE),
				new Student("이강인", 97, Student.Sex.MALE),
				new Student("윤아", 95, Student.Sex.FEMALE)
		);
		
		/* 남학생들만 묶어 List 컬렉션 생성
		 * - toList() 메서드의 리턴값은 List 컬렉션
		 */
		List<Student> maleList = list.stream()//오리지널 스트림 참조
			.filter(s->s.getSex()==Student.Sex.MALE)//남학생 필터링
			//toList() 메서드를 호출하여 List 컬렉션을 생성하여 남학생 요소 저장하여 리턴				
			.toList();
		
		//maleList에서 스트림을 얻어내어 요소값을(학생이름) 출력
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		/* 여학생들만 묶어 HashSet 컬렉션 생성
		 * Collectors.toCollection() 메서드의 리턴값은 Set 컬렉션
		 */
		Set<Student> femaleSet = list.stream()
			.filter(s -> s.getSex() == Student.Sex.FEMALE)
			//필터링한 여학생 요소를 HashSet 컬렉션에 저장하여 리턴
			.collect(Collectors.toCollection(() -> new HashSet<Student>()));
		
		//femaleSet에서 스트림을 얻어내어 요소값을(학생이름) 출력
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}//end of main
}


