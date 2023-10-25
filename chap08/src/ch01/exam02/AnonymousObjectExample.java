package ch01.exam02;

public class AnonymousObjectExample {
	public static void main(String[] args) {
		
		// RemoteControl �������̽��� �͸� ���� ��ü ����
		RemoteControl rc = new RemoteControl() {
			// �ʵ�
			private int volume;
			
			// turnOn() �߻� �޼ҵ��� ���� �޼ҵ�
			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
				messageInfo("TV ��û�� �����մϴ�.");
				System.out.println();
			}
			
			// turnOff() �߻� �޼ҵ��� ���� �޼ҵ�
			@Override
			public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
			messageInfo("TV ��û�� �Ұ����մϴ�.");
			System.out.println();
			}

			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("���� TV ����: " + this.volume);
				System.out.println();
			}
			
			public void messageInfo(String meassage) {
				System.out.println(meassage);
			}
		}; // end of RemoteControl rc
		
		// �͸� ���� ��ü�� �޼ҵ� ȣ��
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		// �͸� ������ü �ȿ� ����� ����� �͸� ������ü �ȿ����� ��밡�� -> ���������ڿ� �������� �ʴ´�..
		//rc.messageInfo("�͸� ���� ��ü �޼��� ȣ��");
		
	} // end of main
}
