package sec01.exam06;

public class BookShelfExample {

	public static void main(String[] args) {
		
		// Queue �������̽� Ÿ�� ������ BookShelf() ��ü �Ҵ�
		Queue shelfQueue = new BookShelf();
		shelfQueue.pushQueue("���ǽ�1");
		shelfQueue.pushQueue("���ǽ�2");
		shelfQueue.pushQueue("���ǽ�3");
		
		System.out.println("å�忡 �ִ� å �� : " + shelfQueue.getSize() + "��");
		
		System.out.println("å�忡 �ִ� å ������� ������");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
