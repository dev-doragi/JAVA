package sec04.exam06;

public class ClculatorExmaple {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10);
		
		// ���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// ��� ���
		System.out.println("���簢�� ����: " + (int)result1 + "CM��");
		System.out.println("���簢�� ����: " + (int)result2 + "CM��");

	}

}