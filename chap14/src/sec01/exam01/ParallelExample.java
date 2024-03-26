package sec01.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= 100; i++) {
			list.add("수강신청자-" + i);
		}
		//순차 처리
		Stream<String> stream = list.stream();
		//스트림에서 forEach()로 요소를 처리하는 람다식 작성
		//stream.forEach( (name) -> print(name));
		
		//static 메서드 참조로 람다식 작성(클래스이름::메서드명) 
		stream.forEach(ParallelExample :: print);

		System.out.println();
		
		//병렬 처리
		/* parallelStream() 메서드로 병렬처리가 가능한 스트림을 가져옴
		 * - 컬렉션 내부적으로 멀티 스레드로 병렬처리 수행 
		 * - static 메서드 참조로 람다식 작성(클래스이름::메서드명) 
		 */
		Stream<String> parallelStream = list.parallelStream();
		//parallelStream.forEach((name) -> print(name));
		parallelStream.forEach(ParallelExample :: print);
	}//end of main
	
	public static void print(String name) {
		System.out.println(name + " : " + Thread.currentThread().getName());
	}	
}

