package sec01.exam00.abstraction;

public class Car implements Vehicle{ 
	// implements -> Vehicle�̶�� �������̽��� ����

	@Override
	public void start() {
		System.out.println("�ڵ����� ����߽��ϴ�.");
	}

	@Override
	public void moveForward() {
		System.out.println("�ڵ����� ������ �����մϴ�.");
	}

	@Override
	public void moveBackward() {
		System.out.println("�ڵ����� ������ �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�");
	} 
}
