package sec01.inheritance.abstracts;

public class Main {

	public static void main(String[] args) {
		// �������� Dog, Cat ��ü ����
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// ������ Eagle, Parrot ��ü ����
		Eagle eagle = new Eagle();
		Parrot parrot = new Parrot();
		
		// ������ Ÿ���� �迭�� �������� ��ü�� �־� ����
		Mammal mammals[] = new Mammal[] { dog, cat };
		//Mammal[] mammals = new Mammal[] { dog, cat };
		
		// ���� Ÿ���� �迭�� ������ ��ü�� �־� ����
		Bird[] birds = new Bird[] { parrot, eagle };
		
		Animal[] animals = new Animal[] { dog, cat, parrot, eagle };
		
		for (Animal ani : animals) {
			ani.eat();
			ani.sound();
		}
		System.out.println();
		
		for (Mammal mam : mammals) {
			mam.eat();
			mam.sound();
			mam.character();
		}
		System.out.println();
		
		for (Bird bird : birds) {
			bird.eat();
			bird.sound();
			bird.character();
		}
		System.out.println();

	}

}
