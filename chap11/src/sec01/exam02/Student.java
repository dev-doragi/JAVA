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
		// [1] 두 객체가 동일한 타입의 객체인지 비교
		if(obj instanceof Student) {
			Student student = (Student) obj;
			
			// [2] 두 객체의 필드 값 비교
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
		// id 필드 값으로 hashCode 생성 반환
		// return this.id;
		
		// id와 name 필드값을 결합하여 hash돌리기
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
