package sec04.exam03;

public class Car {
	// �ʵ�
	private int gas;
	
	// ������
	
	// �޼���
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.\n");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.\n");
		return true; 
	}

	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("������...      (gas �ܷ�: " + this.getGas() + ")");
				gas--;
			} else {
				System.out.println("�����մϴ�. (gas �ܷ�: " + this.getGas() + ")\n");
				return;
			}
		}
	}
}
