package sec01.exam01;

public class StudentExample {
	
	public static void main(String[] args) {
		Student sony = new Student(221001, "�����");
		Student mina = new Student(221002, "��̳�");
		
		System.out.println("=== �л���� ===");
		System.out.println("�й�: " + sony.getId() + ", �̸�: " + sony.getName());
		System.out.println("�й�: " + mina.getId() + ", �̸�: " + mina.getName());
	}

}
