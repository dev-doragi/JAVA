package sec01.exam06;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void pushQueue(String title) {
		shelf.add(title); // �迭(shelf)�� ��� �߰�		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}	

}
