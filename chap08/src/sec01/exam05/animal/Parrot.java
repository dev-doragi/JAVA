package sec01.exam05.animal;

public class Parrot extends Bird implements PetAnimal{

	@Override
	public void eat() {
		System.out.println("�޹����� �޹��� ��Ḧ �Դ´�.");		
	}

	@Override
	public void sound() {
		System.out.println("�޹����� ����� ���� �䳻����.");		
	}

	@Override
	public void beFriendly() {
		System.out.println("�޹����� ����� ģ�� �����̴�.");
	}
	
}
