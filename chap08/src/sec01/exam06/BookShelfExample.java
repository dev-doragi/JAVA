package sec01.exam06;

public class BookShelfExample {

	public static void main(String[] args) {
		
		// Queue 인터페이스 타입 변수에 BookShelf() 객체 할당
		Queue shelfQueue = new BookShelf();
		shelfQueue.pushQueue("원피스1");
		shelfQueue.pushQueue("원피스2");
		shelfQueue.pushQueue("원피스3");
		
		System.out.println("책장에 있는 책 수 : " + shelfQueue.getSize() + "권");
		
		System.out.println("책장에 있는 책 순서대로 꺼내기");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
