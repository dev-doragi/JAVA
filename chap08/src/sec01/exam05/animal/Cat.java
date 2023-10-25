package sec01.exam05.animal;

public class Cat extends Mammal implements PetAnimal {

	@Override
	public void eat() {
		System.out.println("고양이는 고양이 사료를 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 운다.");
	}

	@Override
	public void beFriendly() {
		System.out.println("고양이는 사람과 매우 친한 반려묘이다.");
	}

}
