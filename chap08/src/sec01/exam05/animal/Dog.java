package sec01.exam05.animal;

public class Dog extends Mammal implements PetAnimal {

	@Override
	public void eat() {
		System.out.println("���� �� ��Ḧ �Դ´�.");
	}

	@Override
	public void sound() {
		System.out.println("���� �۸� ¢�´�.");
	}

	@Override
	public void beFriendly() {
		System.out.println("���� ����� �ſ� ģ�� �ݷ����̴�.");
	}
	
}
