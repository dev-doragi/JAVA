package sec05.exam04.singleton.after;

public class Settings {
	// 필드 기본값 설정
	private boolean darkMode = false;
	private int fontSize = 15;
	
	// 생성자
	private Settings() {} // 외부에서 생성자 호출 불가
	// 참조형 변수(정적 필드)
	private static Settings settings = null; // 자신의 인스턴스 생성
	
	public static Settings getInstance() { // 싱글톤 객체 생성 루틴
		if (settings == null) {
			settings = new Settings();
		}
		return settings;
	}
	
	public boolean getDarkMode() {
		return darkMode;
	}
	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	
	public void getTheme(boolean mode) {
		if (mode == true) {
			System.out.println("Theme: Dark");
		} else {
			System.out.println("Theme: Light");
		}
	}
}
