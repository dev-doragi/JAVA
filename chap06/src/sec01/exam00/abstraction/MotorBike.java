package sec01.exam00.abstraction;

public class MotorBike implements Vehicle {

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
