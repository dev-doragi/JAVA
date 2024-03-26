package sec06.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
		new Student("손흥민", "남자", 97),
		new Student("아이유", "여자", 98),
		new Student("이강인", "남자", 95),
		new Student("김민지", "여자", 96)
	);
	/* Predicate 함수형 인터페이스의 구현 객체를 매개변수를 받아 평균을 구하는 메소드
	 * - avg() 메서드의 매개변수를 Predicate 함수형 인터페이스로 선언하면
	 *   Predicate의 test() 메서드가 매개값을 조사해 true 또는 false에 따라
	 *   평균값을 계산
	 */
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {//student를 조사하여 true이면 
				count++;
				sum += student.getScore();//점수누적
			}
		}
		return (double) sum / count;//평균값 계산 후 리턴
	}
		
	public static void main(String[] args) {
		//avg(Predicate 구현객체를 생성하는 로직을 람다식으로 작성)
		double maleAvg = avg( (t) ->  { return t.getSex().equals("남자");} );
		System.out.println("남자 평균 점수: " + maleAvg);
			
		double femaleAvg = avg( (t) ->  t.getSex().equals("여자") );
		System.out.println("여자 평균 점수: " + femaleAvg);
	}//end of main
}


