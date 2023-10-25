package sec01.exam05.animal;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Parrot parrot = new Parrot();
		Eagle eagle = new Eagle();
		
		// ������ Ÿ���� �迭�� �������� ��ü�� �־� ����
		Mammal[] mammals = new Mammal[] { dog, cat };

		// ���� Ÿ���� �迭�� ������ ��ü�� �־� ����
		Bird[] birds = new Bird[] { parrot, eagle };
		
		// ���� Ÿ���� �迭�� ��� �������� ��ü�� �־� ����
		Animal[] animals = new Animal[] {dog, cat, parrot, eagle };
		
		for (Animal animal : animals) {
			animal.eat();
			animal.sound();
			animal.character();
		}
		System.out.println("===========================");
		
		for (Mammal mammal : mammals) {
			mammal.eat();
			mammal.sound();
			mammal.character();
		}
		System.out.println("===========================");
		
		for (Bird bird : birds) {
			bird.eat();
			bird.sound();
			bird.character();
		}
		System.out.println("===========================");
	
		PetAnimal[] petAnimals = new PetAnimal[] { dog, cat, parrot };
	
		for (PetAnimal petAnimal : petAnimals) {
			petAnimal.beFriendly();
		}
	}
}
