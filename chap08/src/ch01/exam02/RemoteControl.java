package ch01.exam02;

public interface RemoteControl {
	// 상수
	final int MAX_VOLUME = 10;
	final int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
