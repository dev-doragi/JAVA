package sec05.exam04.singleton.before;

public class SecondPage {
	// Settings �ν��Ͻ� ����
	private Settings settings = new Settings();
	
	public void setAndPrintSettings() {
		// ���� ���� ���
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: " + settings.getFontSize());
		System.out.println();
	}
}
