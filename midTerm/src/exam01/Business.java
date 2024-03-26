package exam01;

public class Business extends Student {
	private String track;
	
	public Business(int id, String name, String dept) {
		super(id, name, dept);
	}
	
	public Business(int id, String name, String dept, String track) {
		this(id, name, dept);
		this.track = track;
	}
	
	@Override
	public void infoMajor() {
		System.out.println("����: �����濵��");
	}
	
	public void infoTrack() {
		System.out.println("����Ʈ��: " + track + "\n");
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}
	
}
