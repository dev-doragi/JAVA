package sec01.exam00.inheritance;

public class Vehicle {
	String model;
	String color;
	int wheels;
	
	public void start() {
		System.out.println("���� ����մϴ�!");
	}
	
	public void moveForward() {
		System.out.println("������ ���ϴ�.");
	}
	
	public void moveBackward() {
		System.out.println("�ڷ� �����մϴ�.");
	}
	
	public void stop() {
		System.out.println("��� ��! �����մϴ�.");
	}
}