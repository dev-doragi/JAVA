package sec01.exam00.abstraction;

// �߻�ȭ ����(Abstraction)
/* �������̽���
 *  �߻� �޼��峪 ����� ���ؼ� � ��ü�� �����ؾ� �ϴ� �ٽ����� ���(����)���� �����صΰ�,
 *  �������� ������ �ش� �������̽��� �����ϴ� ������ ��ü�鿡�� �ϵ��� ���α׷��� �����ϴ� �� */
public interface Vehicle {
	// �߻� �޼���(�̿ϼ� �޼���)
	public abstract void start(); 
	public abstract void moveForward();
	public abstract void moveBackward();
	public abstract void stop();
}
