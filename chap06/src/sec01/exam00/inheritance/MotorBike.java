package sec01.exam00.inheritance;

public class MotorBike extends Vehicle{
	boolean isRaceable;
	
	void stunt() {
		System.out.println("������̷� ���⸦ �θ��ϴ�.");
	}

	@Override
	public void start() {
		System.out.println("������̰� ���� ����մϴ�!");
	}

	@Override
	public void moveForward() {
		System.out.println("������̰� �ڷ� �����մϴ�.");
	}

	@Override
	public void moveBackward() {
		System.out.println("������̰� �ڷ� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������� ��! �����մϴ�.");
	}
	
}
