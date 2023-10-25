package test;

public abstract class Dormitory {
	private int number;
	private String sex;
	
	public abstract void Info();
	
	public abstract void setPlace(String sex);
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
