package ch01.exam02;

public interface RemoteControl {
	// ���
	final int MAX_VOLUME = 10;
	final int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
