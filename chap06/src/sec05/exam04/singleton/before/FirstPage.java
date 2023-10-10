package sec05.exam04.singleton.before;

public class FirstPage {
	// Settings 인스턴스 생성
	private Settings settings = new Settings();
	
	public void setAndPrintSettings() {
		// DarkMode & FontSize  설정
		settings.setDarkMode(true);
		settings.setFontSize(17);
		
		// 설정 내용 출력
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: " + settings.getFontSize());
		System.out.println();
	}
}
