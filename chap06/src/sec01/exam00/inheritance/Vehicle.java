package sec01.exam00.inheritance;

/* ���(Inheritance)
 * - ����̶� ������ Ŭ������ ��Ȱ���Ͽ� ���ο� Ŭ������ �ۼ�(Ȯ��)�ϴ� �ڹ��� ���� ���
 * - ����� Ŭ���� �� ������ �� �ִ� �Ӽ��� ��ɵ��� ���� Ŭ������ �߻�ȭ���� 
 *   �ش� ���� Ŭ�����κ��� Ȯ��� ���� ���� ���� Ŭ�������� ��� ���� Ŭ������ �Ӽ��� ��ɵ��� ��� ����
 * - Ŭ������ �� �����ϴ� �Ӽ��� ��ɵ��� �����ϰ� ������ �� �־� �ݺ����� �ڵ带 �ּ�ȭ
 */
/* Car/MotorBike�� �������� �Ӽ��� ����� �߻�ȭ�Ͽ� Vehicle Ŭ����(���� Ŭ����) ���� */

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