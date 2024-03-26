package exam02;

public class Television implements IRemoteable {
	@Override
	public void turnOn() {
		System.out.println("TV On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV Off");
	}
}
