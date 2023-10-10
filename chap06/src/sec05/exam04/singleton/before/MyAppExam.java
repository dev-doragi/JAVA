package sec05.exam04.singleton.before;

public class MyAppExam {

	public static void main(String[] args) {
		System.out.println("[FirstPage]");
		// FirstPage 인스턴스 생성 및  setAndPrintSettings()  메서드 호출
		new FirstPage().setAndPrintSettings();
		
		System.out.println("[SecondPage]");
		// SecondPage 인스턴스 생성 및 setAndPrintSettings() 메서드 호출
		new SecondPage().setAndPrintSettings();

	}

}
