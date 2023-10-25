package sec01.exam05.animal;

public class Dog extends Mammal implements PetAnimal {

	@Override
	public void eat() {
		System.out.println("개는 개 사료를 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("개는 멍멍 짖는다.");
	}

	@Override
	public void beFriendly() {
		System.out.println("개는 사람과 매우 친한 반려견이다.");
	}
	
}
