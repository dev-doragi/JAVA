package sec04.exam05;

public class Car {
	// �ʵ�
	int speed;
	
	// ������
	
	// �޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("�õ��� �̴ϴ�.\n");
	}
	
	void run() {
		for(int i = 0; i <= 50; i +=10) {
			speed = i;
			System.out.println("�޸��ϴ�. (�ü�: " + speed + "Km/h)");
		}
		System.out.println();
	}
}
