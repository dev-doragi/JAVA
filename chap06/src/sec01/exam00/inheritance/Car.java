package sec01.exam00.inheritance;

public class Car extends Vehicle {

	boolean isConvertible;
	
	void openWindow() {
		System.out.println("�ڵ����� ��� â���� ���ϴ�.");
	}

	@Override
	public void start() {
		System.out.println("�ڵ����� ���� ����մϴ�!");
	}

	@Override
	public void moveForward() {
		System.out.println("�ڵ����� �ڷ� �����մϴ�.");
	}

	@Override
	public void moveBackward() {
		System.out.println("�ڵ����� �ڷ� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� ��! �����մϴ�.");
	}
	
}
