                  package sec05.exam04.singleton.after;

public class MyAppExam {

	public static void main(String[] args) {
		System.out.println("[FirstPage]");
		// FirstPage 인스턴스 생성 및  setAndPrintSettings()  메서드 호출
		new FirstPage().setAndPrintSettings();
		
		new FirstPage().setSettings();
		System.out.println("[SecondPage]");
		// SecondPage 인스턴스 생성 및 setAndPrintSettings() 메서드 호출
		// 객체를 하나로 돌려가면서 쓰기 때문에 SecondPage도 FirstPage와 같은 객체임
		new SecondPage().setAndPrintSettings();

		// new FirstPage().setSettings();
		System.out.println("[FirstPage]");
		// FirstPage 인스턴스 생성 및  setAndPrintSettings()  메서드 호출
		new FirstPage().setAndPrintSettings();
	}
	
}
