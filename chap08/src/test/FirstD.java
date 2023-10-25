package test;

public class FirstD extends Dormitory implements ForWho {
	@Override
	public void Info() {
		System.out.println("당신은 1기숙사 생도입니다.");
		System.out.println("호실 번호: " + getNumber());
		System.out.println("성별: " + getSex());
	}
	
	@Override
	public void setPlace(String sex) {
		if ( sex == "남자" || sex == "남성") {
			System.out.println("남성 생도는 왼쪽 구역을 이용하세요.");
		}
		else if ( sex == "여자" || sex == "여성") {
			System.out.println("여성 생도는 오른쪽 구역을 이용하세요.");
		}
		else {
			System.out.println("성별이 잘못 입력되었습니다. 프로그램을 다시 시작하세요.");
		}
	}
	
	@Override
	public void isFor() {
		System.out.println("내국인 전용 기숙사입니다.");
	}
}
