                  package sec05.exam04.singleton.after;

public class MyAppExam {

	public static void main(String[] args) {
		System.out.println("[FirstPage]");
		// FirstPage �ν��Ͻ� ���� ��  setAndPrintSettings()  �޼��� ȣ��
		new FirstPage().setAndPrintSettings();
		
		new FirstPage().setSettings();
		System.out.println("[SecondPage]");
		// SecondPage �ν��Ͻ� ���� �� setAndPrintSettings() �޼��� ȣ��
		// ��ü�� �ϳ��� �������鼭 ���� ������ SecondPage�� FirstPage�� ���� ��ü��
		new SecondPage().setAndPrintSettings();

		// new FirstPage().setSettings();
		System.out.println("[FirstPage]");
		// FirstPage �ν��Ͻ� ���� ��  setAndPrintSettings()  �޼��� ȣ��
		new FirstPage().setAndPrintSettings();
	}
	
}
