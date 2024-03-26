package sec01.exam07;

import java.util.*;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getcName() + " ������: " +
						course.getmList().toString());
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getcName() + " ������: " +
						course.getmList().toString());
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getcName() + " ������: " +
						course.getmList().toString());
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����");
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("������"));
		personList.add(new HighStudent("�����"));
		personList.add(new Student("������"));
		personList.add(new Worker("������"));
		
		personCourse.setmList(personList);
		
		Course<Student> studentCourse = new Course<Student>("�л� ����");
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("������"));
		studentList.add(new HighStudent("�����"));
		studentList.add(new Student("������"));
		studentList.add(new HighStudent("������"));
		
		studentCourse.setmList(studentList);
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л� ����");
		ArrayList<HighStudent> hithStudentList = new ArrayList<HighStudent>();
		
		hithStudentList.add(new HighStudent("�����"));
		hithStudentList.add(new HighStudent("������"));
		
		highStudentCourse.setmList(hithStudentList);
		
		Course<Worker> workerCourse = new Course<Worker>("�ٷ��� ����");
		ArrayList<Worker> workerList = new ArrayList<Worker>();
		
		workerList.add(new Worker("������"));
		workerList.add(new Worker("�����"));
		workerList.add(new Worker("������"));
		workerList.add(new Worker("������"));
		
		workerCourse.setmList(workerList);
		
		registerCourse(personCourse);
		registerCourse(studentCourse);
		registerCourse(workerCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		registerCourseStudent(highStudentCourse);
		registerCourseStudent(studentCourse);
		// registerCourseStudent(workerCourse);
		System.out.println();
		
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
		System.out.println();
		
		Iterator<Person> it = personList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
