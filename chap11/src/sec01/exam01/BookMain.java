package sec01.exam01;

public class BookMain {

	public static void main(String[] args) {
		// Book Ŭ���� ���� (Generic)
		Book<String> b1 = new Book<String>();
		b1.setContent("���ϸ��� ���߷�");
		System.out.println(b1.getContent());
		
		Book<Integer> b2 = new Book<>();
		b2.setContent(12500);
		System.out.println(b2.getContent());

	}

}
