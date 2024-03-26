package exam02;

public class RemoteMain {

	public static void main(String[] args) {
		Remote remote = new Remote();
		
		remote.useRemote(new Television());
		System.out.println();
		remote.useRemote(new Audio());
	}
}
