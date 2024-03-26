package exam02;

public class Audio implements IRemoteable {
	@Override	
	public void turnOn() {
		System.out.println("Audio On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio Off");
	}
}
