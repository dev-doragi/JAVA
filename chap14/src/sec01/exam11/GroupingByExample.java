package sec01.exam11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		//컬렉션 생성
		List<Student> list = Arrays.asList(
				new Student("손흥민", 98, Student.Sex.MALE),
				new Student("아이유", 96, Student.Sex.FEMALE),
				new Student("이강인", 97, Student.Sex.MALE),
				new Student("윤아", 95, Student.Sex.FEMALE)
		);
		
		/* 성별로 학생 객체를 그룹핑해서 Map 객체 생성
		 * Map 타입 변수 선언<key:학생의 성별, value:학생 List 컬렉션> 변수명 */
		Map<Student.Sex, List<Student>> mapBySex = list.stream()//오리지널 스트림 얻기
				//학생의 성별 key로 그룹핑하여 Map 컬렉션 생성(요소:Student 객체)
				.collect(Collectors.groupingBy(Student :: getSex));
		
		//남학생 그룹핑 컬렉션 확인
		System.out.print("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream()
		        .forEach(s->System.out.print(s.getName() + " "));
		
		//여학생 그룹핑 컬렉션 확인
		System.out.print("\n[여학생] ");		
		mapBySex.get(Student.Sex.FEMALE).stream()
		        .forEach(s->System.out.print(s.getName() + " "));
	}//end of main
}

