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
		System.out.println("전공: 국제경영학");
	}
	
	public void infoTrack() {
		System.out.println("지역트랙: " + track + "\n");
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}
	
}
