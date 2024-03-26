package exam01;

public class StudentExam {

	public static void main(String[] args) {
		Student[] students = {
				new Computer(1001, "�����", "��ǻ�Ͱ���", "�����ͺм�"),
				new Business(2001, "������", "�濵��", "�Ϻ�")
		};
		
		for (Student student : students) {
			System.out.println(student.infoStudent());
			student.infoMajor();
			
			if (student instanceof Computer) {
				((Computer)student).infoProject();
			} else {
				((Business)student).infoTrack();
			}
		}
		
	} // end of main

} // end of StudentExam
