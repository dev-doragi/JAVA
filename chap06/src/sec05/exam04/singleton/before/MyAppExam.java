package sec05.exam04.singleton.before;

public class MyAppExam {

	public static void main(String[] args) {
		System.out.println("[FirstPage]");
		// FirstPage �ν��Ͻ� ���� ��  setAndPrintSettings()  �޼��� ȣ��
		new FirstPage().setAndPrintSettings();
		
		System.out.println("[SecondPage]");
		// SecondPage �ν��Ͻ� ���� �� setAndPrintSettings() �޼��� ȣ��
		new SecondPage().setAndPrintSettings();

	}

}
