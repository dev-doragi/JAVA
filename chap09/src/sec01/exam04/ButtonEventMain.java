package sec01.exam04;

public class ButtonEventMain {

	public static void main(String[] args) {
		
		// ��ư ��ü ����
		Button button = new Button();
		
		button.setOnClickListener(new PhoneButtonListener());
		button.buttononClick();
		
		button.setOnClickListener(new MessageButtonListener());
		button.buttononClick();
		
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("ī�޶� ��ư�� Ŭ���߽��ϴ�.");
			}
		});
		button.buttononClick();
		
	} // end of main

} // end of ButtonEvenMain