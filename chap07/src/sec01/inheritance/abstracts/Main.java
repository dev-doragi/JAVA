package sec01.inheritance.abstracts;

public class Main {

	public static void main(String[] args) {
		// 포유류과 Dog, Cat 객체 생성
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// 조류과 Eagle, Parrot 객체 생성
		Eagle eagle = new Eagle();
		Parrot parrot = new Parrot();
		
		// 포유류 타입의 배열에 포유류과 객체를 넣어 관리
		Mammal mammals[] = new Mammal[] { dog, cat };
		//Mammal[] mammals = new Mammal[] { dog, cat };
		
		// 조류 타입의 배열에 조류과 객체를 넣어 관리
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
