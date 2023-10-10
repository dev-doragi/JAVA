package sec04.exam06;

public class ClculatorExmaple {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// 결과 출력
		System.out.println("정사각형 넓이: " + (int)result1 + "CM²");
		System.out.println("직사각형 넓이: " + (int)result2 + "CM²");

	}

}
