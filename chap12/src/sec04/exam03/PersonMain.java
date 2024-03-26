package sec04.exam03;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((name, job) -> {
			System.out.println(name + "은 " + job + "입니다.");
		});
		
		person.action2((message) -> System.out.println(message + "라고 인사합니다."));
		person.action2(message -> System.out.println(message + "! 라고 인사합니다."));
	}//end of main
}

