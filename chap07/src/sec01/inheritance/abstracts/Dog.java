package sec01.inheritance.abstracts;

public class Dog extends Mammal{

	@Override
	public void eat() {
		System.out.println("°³´Â °³»ç·á¸¦ ¸Ô´Â´Ù.");
	}

	@Override
	public void sound() {
		System.out.println("°³´Â ¸Û¸Û Â¢´Â´Ù.");
	}

}
  