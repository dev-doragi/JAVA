package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car("G90", "White", 350, 0);
		
		// �ʵ� �� �б�
		System.out.println("�ڵ��� ��: " + myCar.model);
		System.out.println("�ڵ��� �÷�: " + myCar.color);
		System.out.println("�ִ� �ӵ�: " + myCar.getMaxSpeed() + "Km");
		
		// �ʵ� �� ����
		myCar.setSpeed(70);
		System.out.println("���� �ӵ�: " + myCar.getSpeed() + "Km");
		System.out.println();
		
		// �޼ҵ� ȣ��
		System.out.println(myCar.getCarInfo());
	} // end of main
} // end of CarExample
