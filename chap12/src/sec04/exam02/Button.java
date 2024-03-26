package sec04.exam02;

public class Button {
	//정적 멤버 인터페이스
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//setter
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	//메소드
	public void click() {
		//clickListener.onClick() 호출
		this.clickListener.onClick();
	}	
}//end of class

