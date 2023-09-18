package sec01.exam01;

public class Student {
	public static int nextId = 1; 
	private int id;
	
	public void setId() {
		this.id = nextId;
		nextId++;	
	}
	
	public int getId() {
		return id;
	}
}
