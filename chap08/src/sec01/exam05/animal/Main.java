package sec01.exam05.animal;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Parrot parrot = new Parrot();
		Eagle eagle = new Eagle();
		
		// 포유류 타입의 배열에 포유류과 객체를 넣어 관리
		Mammal[] mammals = new Mammal[] { dog, cat };

		// 조류 타입의 배열에 조류과 객체를 넣어 관리
		Bird[] birds = new Bird[] { parrot, eagle };
		
		// 동물 타입의 배열에 모든 동물들의 객체를 넣어 관리
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
