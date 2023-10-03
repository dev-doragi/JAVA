package sec01.exam00.encapsulation;

public class Car {
	private String model;
	private String color;
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	private void startEngine() {
		System.out.println("�ڵ��� �õ��� �̴ϴ�.");	
	}
	
	private void moveForward() {
		System.out.println("�ڵ����� ������ ���ϴ�.");
	}
	
	private void openWindow() {
		System.out.println("��� â���� ���ϴ�.");
	}
	
    public void operate() { 
    // private�� ��� �޼���鿡 �����ϱ� ���� public�� operate��� �Լ��� ���ؼ� ���� -> ĸ��ȭ
        startEngine();
        moveForward();
        openWindow();
    }
	
	// getter & setter ����ؼ� private ��� ������ �����ϱ�
	// ��Ŭ�� �ҽ� generate getter & setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
