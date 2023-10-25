package ch01.exam02;

public class AnonymousObjectExample {
	public static void main(String[] args) {
		
		// RemoteControl 인터페이스의 익명 구현 객체 선언
		RemoteControl rc = new RemoteControl() {
			// 필드
			private int volume;
			
			// turnOn() 추상 메소드의 구현 메소드
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
				messageInfo("TV 시청이 가능합니다.");
				System.out.println();
			}
			
			// turnOff() 추상 메소드의 구현 메소드
			@Override
			public void turnOff() {
			System.out.println("TV를 끕니다.");
			messageInfo("TV 시청이 불가능합니다.");
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
				System.out.println("현재 TV 볼륨: " + this.volume);
				System.out.println();
			}
			
			public void messageInfo(String meassage) {
				System.out.println(meassage);
			}
		}; // end of RemoteControl rc
		
		// 익명 구혀 객체의 메소드 호출
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		// 익명 구현객체 안에 선언된 멤버는 익명 구현객체 안에서만 사용가능 -> 접근제한자에 연연하지 않는다..
		//rc.messageInfo("익명 구현 객체 메서드 호출");
		
	} // end of main
}
