package sec05.exam04.singleton.before;

public class FirstPage {
	// Settings �ν��Ͻ� ����
	private Settings settings = new Settings();
	
	public void setAndPrintSettings() {
		// DarkMode & FontSize  ����
		settings.setDarkMode(true);
		settings.setFontSize(17);
		
		// ���� ���� ���
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: " + settings.getFontSize());
		System.out.println();
	}
}
