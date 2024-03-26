package sec01.exam02;

public class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// [1] �� ��ü�� ������ Ÿ���� ��ü���� ��
		if(obj instanceof Student) {
			Student student = (Student) obj;
			
			// [2] �� ��ü�� �ʵ� �� ��
			if ((this.id == student.id) && (this.name.contentEquals(student.name))) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	} // end of equals
	
	@Override
	public int hashCode() {
		// id �ʵ� ������ hashCode ���� ��ȯ
		// return this.id;
		
		// id�� name �ʵ尪�� �����Ͽ� hash������
		String idName = id + name;
		return idName.hashCode();
	} // end of hashCode
	
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
	
} // end of Student
