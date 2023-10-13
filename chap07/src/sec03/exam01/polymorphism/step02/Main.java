package sec03.exam01.polymorphism.step02;

public class Main {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		/* 객체를 생성하여 해당 클래스 타입의 배열에 저장 */
		for ( int i = 0; i < animals.length; i++) {
			int num = (int) (Math.random() * 3);
			System.out.println(num);
			
			if (num == 0) {
				animals[i] = new Human();
			} else if (num == 1) {
				animals[i] = new Tiger();
			} else {
				animals[i] = new Eagle();
			}
		}
		// 배열에 저장된 객체의 메서드 호출
		for (Animal animal : animals) {
			if (animal instanceof Human) {
				((Human) animal).humanMove(); // down-casting 
			} else if (animal instanceof Tiger) {
				((Tiger) animal).tigerMove();
			} else {
				((Eagle) animal).eagleMove();
			}
		}
	}
}
