package sec01.exam01;

public class VariableExam {
	public static void main(String[] args) {
		Student s1 = new Student(); 
		s1.setId();
		System.out.println("s1.id: " + s1.getId());
		
		Student s2 = new Student();
		s2.setId();
		System.out.println("s2.id: " + s2.getId());
		
		int cNextId = Student.nextId;
		System.out.println("Current nextId: " + cNextId);
	}
}
