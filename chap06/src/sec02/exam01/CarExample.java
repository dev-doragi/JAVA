package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car("G90", "White", 350, 0);
		
		// 필드 값 읽기
		System.out.println("자동차 모델: " + myCar.model);
		System.out.println("자동차 컬러: " + myCar.color);
		System.out.println("최대 속도: " + myCar.getMaxSpeed() + "Km");
		
		// 필드 값 변경
		myCar.setSpeed(70);
		System.out.println("현재 속도: " + myCar.getSpeed() + "Km");
		System.out.println();
		
		// 메소드 호출
		System.out.println(myCar.getCarInfo());
	} // end of main
} // end of CarExample
