package sec04.exam02;

public class ButtonMain {
	public static void main(String[] args) {
		//확인 버튼 생성
		Button confirmBtn = new Button();
		
		//setter를 사용하여 clickListener 필드에 람다식 할당
		confirmBtn.setClickListener(() -> {
			System.out.println("확인 버튼을 클릭했습니다.");
			System.out.println("입력한 정보를 DB에 저장합니다.");
		});
		//confirmBtn 클릭
		confirmBtn.click();
		System.out.println("------------------");
		
		
		//취소 버튼 생성
		Button cancelBtn = new Button();
		
		//setter를 사용하여 clickListener 필드에 람다식 할당
		cancelBtn.setClickListener(() -> System.out.println("취소 버튼을 클릭했습니다."));
		//cancelmBtn 클릭
		cancelBtn.click();
	}//end of main
}//end of class



