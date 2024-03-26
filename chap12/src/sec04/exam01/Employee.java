package sec04.exam01;

/* Workable 인터페이스 타입의 매개변수를 갖는 
 * action() 메소드를 갖는 Employee 클래스 */
public class Employee {
	private String job = "직무";
	public void action(Workable w) {
		w.work();
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}

