package sec01.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {
	public static void main(String[] args) {
		//studentList 컬렉션 생성
		List<Student> studentList = Arrays.asList(
				new Student("손흥민", 99),
				new Student("이강인", 97),
				new Student("김민재", 98)
		);
			
		//객체를 Int(점수)로 변환하는 중간 스트림을 통해 점수를 출력
		studentList.stream()
			/* IntStream mapToInt(ToIntFunction<? super T> mapper)
			 * - ToIntFunction<? super T> 함수형 인터페이스는 T객체를 인수로 받아
			 *   int로 매핑하여 IntStream으로 반환(int applyAsInt(T value);)
			 * - Student 객체의 getScore() 메서드를 호출하여 점수로 매핑하여 IntStream 생성
			 */
			.mapToInt(student ->  student.getScore())//매핑
			//.mapToInt(Student :: getScore)//매핑
			.forEach(score -> System.out.println(score));
	}
}
