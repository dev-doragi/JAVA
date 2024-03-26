package exam01;

public class Computer extends Student {
	private String project;
	
	public Computer(int id, String name, String dept) {
		super(id, name, dept); // 오답
	}
	
	public Computer(int id, String name, String dept, String project) {
		this(id, name, dept); // 오답
		this.project = project;
	}
	
	@Override
	public void infoMajor() {
		System.out.println("전공: 데이터베이스");
	}

	public void infoProject() {
		System.out.println("프로젝트: " + project + "\n");
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

}
