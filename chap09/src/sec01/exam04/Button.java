package sec01.exam04;

public class Button {

	/* �ʵ� ����*/
	OnClickListener listener;

	// �޼��� ���� 
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void buttononClick() {
		listener.onClick();
	}
		
	static interface OnClickListener {
		// onClick() �߻� �޼���
		void onClick();
	}
}