package sec01.exam05.animal;

public class Parrot extends Bird implements PetAnimal{

	@Override
	public void eat() {
		System.out.println("앵무새는 앵무새 사료를 먹는다.");		
	}

	@Override
	public void sound() {
		System.out.println("앵무새는 사람의 말을 흉내낸다.");		
	}

	@Override
	public void beFriendly() {
		System.out.println("앵무새는 사람과 친한 조류이다.");
	}
	
}
