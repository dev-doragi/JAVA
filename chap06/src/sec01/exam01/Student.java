package sec01.exam01;

public class Student {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super(); // 자신이 상속받은 부모의 생성자를 호출하는 메소드
		this.id = id;
		this.name = name;
	}

	// private 멤버 변수에 접근하기 위한 getter & setter
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
}