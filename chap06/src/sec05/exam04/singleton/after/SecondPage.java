package sec05.exam04.singleton.after;

public class SecondPage {
	private Settings settings = Settings.getInstance();
	
	public void setAndPrintSettings() {
		// 설정 내용 출력
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: " + settings.getFontSize() + "\n");
	}
}
