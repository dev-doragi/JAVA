package sec01.exam04;

public class Button {

	/* 필드 선언*/
	OnClickListener listener;

	// 메서드 선언 
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void buttononClick() {
		listener.onClick();
	}
		
	static interface OnClickListener {
		// onClick() 추상 메서드
		void onClick();
	}
}