package sec01.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("손흥민", 98), 
				new Student("이강인", 96), 
				new Student("김민재", 97)
		);
		
		/*** 평균성적 구하기 ***/
		//[방법-1]
		//컬렉션으로부 스트림을 얻어옴
		Stream<Student> studentStream = list.stream();
		
		/* 중간처리(Student 객체를 score로 매핑)
		 * - mapToInt() 매개변수 타입 : IntStream mapToInt(ToIntFunction<? super T> mapper);
		 * - ToIntFunction<? super T>: 매개변수도 있고, 반환값이 있는 함수형 인터페이스(int applyAsInt(T value)) */
		IntStream scoreStream = studentStream.mapToInt( student -> student.getScore());
		
		/* 최종 처리
		 * - InputStream은 최종 처리를 위해 다양한 메소드를 제공
		 * - average(): 요소들의 평균을 구하는 메소드 */		
		double avg = scoreStream.average().getAsDouble();
		System.out.println("평균: " + avg);		
		System.out.println();
		
		/*[방법-2](메소드 체이닝 패턴)
		 * - 스트림 파이프라인을 구성할 때 주의할 점은 파이프라인 맨 끝에는 반드시 최종 처리가 있어야 동작함 */
		
		//오리지널 스트림 객체를 참조	(Student 객체를 요소를 갖는 스트림)
		avg = list.stream()
			//mapToInt(): 중간처리(학생 객체를 점수로 매핑하여 리턴)
			.mapToInt(Student :: getScore)
			//average(): 최종 처리(평균 점수를 구하는 메서드)
			.average().getAsDouble();//평균값을 Double값으로 받음		
		System.out.println("평균: " + avg);
		
		System.out.println();
		
		/*** 학생의 이름을 출력 ***/
		list.stream()//오리지널 스트림
			.map( student -> student.getName())//중간처리 스트림
			.forEach( name -> System.out.println(name) );//최종처리
	}//end of main
}

