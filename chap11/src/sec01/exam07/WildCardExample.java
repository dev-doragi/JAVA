package sec01.exam07;

import java.util.*;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getcName() + " 수강생: " +
						course.getmList().toString());
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getcName() + " 수강생: " +
						course.getmList().toString());
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getcName() + " 수강생: " +
						course.getmList().toString());
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정");
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("최재인"));
		personList.add(new HighStudent("최재민"));
		personList.add(new Student("최재훈"));
		personList.add(new Worker("최재현"));
		
		personCourse.setmList(personList);
		
		Course<Student> studentCourse = new Course<Student>("학생 과정");
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("최재인"));
		studentList.add(new HighStudent("최재민"));
		studentList.add(new Student("최재훈"));
		studentList.add(new HighStudent("최재현"));
		
		studentCourse.setmList(studentList);
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정");
		ArrayList<HighStudent> hithStudentList = new ArrayList<HighStudent>();
		
		hithStudentList.add(new HighStudent("최재민"));
		hithStudentList.add(new HighStudent("최재현"));
		
		highStudentCourse.setmList(hithStudentList);
		
		Course<Worker> workerCourse = new Course<Worker>("근로자 과정");
		ArrayList<Worker> workerList = new ArrayList<Worker>();
		
		workerList.add(new Worker("최재인"));
		workerList.add(new Worker("최재민"));
		workerList.add(new Worker("최재훈"));
		workerList.add(new Worker("최재현"));
		
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
