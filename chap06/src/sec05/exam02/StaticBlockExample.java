package sec05.exam02;

public class StaticBlockExample {
	int i;
	static String info;
	
	void iMethod() {
		System.out.println("iMethod() ȣ��");
	}
	
	static void sMethod() {
		System.out.println("sMethod() ȣ��");
	}
	
	// ���� �ʱ�ȭ ���
	/* Ŭ������ �޼��� ������ �ε��� �� �ڵ����� �� ���� �����ϴ� ��� 
	 * ���� �ʵ��� �ʱ�ȭ �۾��� ���� �޼��� ȣ�� �۾� ���� -> main �Լ����� ���� ����ȴ�.*/
	static {
		//iMethod
		sMethod();
		
		//i = 100;
		info = "Static Block";
		System.out.println(info);
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
}

