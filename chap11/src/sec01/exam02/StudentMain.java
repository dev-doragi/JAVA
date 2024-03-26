package sec01.exam02;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "º’»ÔπŒ");
		Student s2 = new Student(1001, "º’»ÔπŒ");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		
		System.out.println("s1 hashCode: " + s1.hashCode());
		System.out.println("s2 hashCode: " + s2.hashCode());

	}

}
