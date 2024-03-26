package sec01.exam09;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		//정수 배열
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		//카운팅
		long count = Arrays.stream(arr)
			.filter(n -> n%2==0)//2의 배수만 필터링하여 중간 스트림 생성
			.count();
		System.out.println("2의 배수 개수: " + count);
		
		//총합
		long sum = Arrays.stream(arr)
			.filter(n -> n%2==0)//2의 배수만 필터링하여 중간 스트림 생성
			.sum();//합계
		System.out.println("2의 배수의 합: " + sum);
		
		//평균
		double avg = Arrays.stream(arr)
			.filter(n -> n%2==0)//2의 배수만 필터링하여 중간 스트림 생성
			.average()//평균
			/* average() 반환값이 OptionalDouble이기 때문에 이 객체에서 값을 얻기 위해
			 * getAsDouble() 메서드 호출 */
			.getAsDouble();
		System.out.println("2의 배수의 평균: " + avg);
		
		//최대값
		int max = Arrays.stream(arr)
			.filter(n -> n%2==0)//2의 배수만 필터링하여 중간 스트림 생성
			.max()//최대값
			/* max() 반환값이 OptionalInt이기 때문에 이 객체에서 값을 얻기 위해
			 * getAsInt() 메서드 호출 */
			.getAsInt();
		System.out.println("2의 배수 중 최대값: " + max);
		
		//최소값
		int min = Arrays.stream(arr)
			.filter(n -> n%2==0)//2의 배수만 필터링하여 중간 스트림 생성
			.min()//최소값
			.getAsInt();
		System.out.println("2의 배수 중 최소값: " + min);
		
		//첫 번째 요소
		int first = Arrays.stream(arr)
			.filter(n -> n%3==0)//3의 배수만 필터링하여 중간 스트림 생성
			.findFirst()//첫번째 3의 배수
			.getAsInt();
		System.out.println("첫번째 3의 배수: " + first);
	}//end of main
}
