package exam01;

public class Computer extends Student {
	private String project;
	
	public Computer(int id, String name, String dept) {
		super(id, name, dept); // ����
	}
	
	public Computer(int id, String name, String dept, String project) {
		this(id, name, dept); // ����
		this.project = project;
	}
	
	@Override
	public void infoMajor() {
		System.out.println("����: �����ͺ��̽�");
	}

	public void infoProject() {
		System.out.println("������Ʈ: " + project + "\n");
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

}
