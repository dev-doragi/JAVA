package sec01.exam05.animal;

public class Cat extends Mammal implements PetAnimal {

	@Override
	public void eat() {
		System.out.println("����̴� ����� ��Ḧ �Դ´�.");
	}

	@Override
	public void sound() {
		System.out.println("����̴� �߿��ϰ� ���.");
	}

	@Override
	public void beFriendly() {
		System.out.println("����̴� ����� �ſ� ģ�� �ݷ����̴�.");
	}

}
