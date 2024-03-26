package exam01;

public class Student {
	private int id;
	private String name;
	private String dept;
	
	public Student(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public String infoStudent() {
		StringBuilder stdinfo = new StringBuilder();
		stdinfo.append("[=== 학생정보 ===]");
		stdinfo.append("\n학번: ").append(id);
		stdinfo.append("\n이름: ").append(name);
		stdinfo.append("\n학과: ").append(dept);
		
		return stdinfo.toString();
	}
	
	public void infoMajor() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
