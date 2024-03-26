package sec01.exam04;

public class ButtonEventMain {

	public static void main(String[] args) {
		
		// 버튼 객체 생성
		Button button = new Button();
		
		button.setOnClickListener(new PhoneButtonListener());
		button.buttononClick();
		
		button.setOnClickListener(new MessageButtonListener());
		button.buttononClick();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("카메라 버튼을 클릭했습니다.");
			}
		});
		button.buttononClick();
		
	} // end of main

} // end of ButtonEvenMain