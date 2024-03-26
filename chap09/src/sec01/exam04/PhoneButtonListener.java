package sec01.exam04;

public class PhoneButtonListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화걸기 버튼을 클릭했습니다.");
	}
}