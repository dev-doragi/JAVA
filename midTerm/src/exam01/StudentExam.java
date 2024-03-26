package exam01;

public class StudentExam {

	public static void main(String[] args) {
		Student[] students = {
				new Computer(1001, "손흥민", "컴퓨터공학", "빅데이터분석"),
				new Business(2001, "아이유", "경영학", "일본")
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
