package sec01.exam01;

public class StudentExample {
	
	public static void main(String[] args) {
		Student sony = new Student(221001, "손흥민");
		Student mina = new Student(221002, "김미나");
		
		System.out.println("=== 학생명단 ===");
		System.out.println("학번: " + sony.getId() + ", 이름: " + sony.getName());
		System.out.println("학번: " + mina.getId() + ", 이름: " + mina.getName());
	}

}
