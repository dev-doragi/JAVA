package sec01.exam06;

public interface Queue {
	//  �ԷµǴ� ��� ���� �迭�� �� �������� �߰��ϴ� �޼���
	void pushQueue(String title);
	
	// �迭�� ù �׸� ��ȯ �޼���
	String deQueue();
	
	// ���� Queue�� �ִ� ��� ���� ��ȯ �޼���
	int getSize();
}
