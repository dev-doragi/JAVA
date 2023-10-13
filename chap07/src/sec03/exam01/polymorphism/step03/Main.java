package sec03.exam01.polymorphism.step03;

public class Main {
	public static void main(String[] args) {
		// 부모 클래스 타입의 배열 생성
		Animal[] animals = new Animal[3];
		
		/* 객체를 생성하여 해당 클래스 타입의 배열에 저장 */
		for (int i = 0; i < animals.length; i++) {
			int num = (int) (Math.random() *  3);
			System.out.println(num);
			
			if (num == 0) {
				animals[i] = new Human();
			} else if (num == 1) {
				animals[i] = new Tiger();
			} else {
				animals[i] = new Eagle();
			}
		}
		
		/* 다형성 구현
		 * 동일한 메소드를 호출하지만 실제 animal이 참조하는 객체가
		 * 어떤 객체인지에 따라 다양한 결과를 나타냄 */
		for (Animal animal : animals) {
			animal.move();
		}
	}
}
