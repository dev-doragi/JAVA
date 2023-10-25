package sec05.exam04.singleton.after;

public class FirstPage {
	private Settings settings = Settings.getInstance();
	
	public void setAndPrintSettings() {
		//  DarkMode & FontSize ����
		settings.setDarkMode(true);
		settings.setFontSize(17);
	
		// ���� ���� ���
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: " + settings.getFontSize() + "\n");
	}
	
	public void setSettings() {
		settings.setDarkMode(false);
		settings.setFontSize(22);
	}
	
	public void printSettings() {
		settings.getTheme(settings.getDarkMode());
		System.out.println("Font Size: " + settings.getFontSize() + "\n");
	}
}
