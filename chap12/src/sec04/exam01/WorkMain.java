package sec04.exam01;

public class WorkMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		//실행문이 2개인 경우
		employee.action(() -> {
			employee.setJob("나는 개발자입니다.");
			System.out.println(employee.getJob() + " 개발자 미팅을 진행합니다.");
			System.out.println("SW 설계문서를 작성합니다");
		});
		System.out.println();
		
		//실행문이 1개인 경우
		Workable workable = () -> System.out.println("설계문서에 따라 SW를 개발합니다.");
		employee.action(workable);
	}//end of main
}//end of class


