package sec01.exam05.animal;

public class Eagle extends Bird {

	@Override
	public void eat() {
		System.out.println("독수리는 사냥을 해서 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("독수리는 끼요옷~ 하고 운다.");
	}

}
