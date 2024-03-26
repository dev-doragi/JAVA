package sec01.exam01;

public class BookMain {

	public static void main(String[] args) {
		// Book 클래스 생성 (Generic)
		Book<String> b1 = new Book<String>();
		b1.setContent("도둑맞은 집중력");
		System.out.println(b1.getContent());
		
		Book<Integer> b2 = new Book<>();
		b2.setContent(12500);
		System.out.println(b2.getContent());

	}

}
