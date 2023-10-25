package sec01.exam06;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void pushQueue(String title) {
		shelf.add(title); // 배열(shelf)에 요소 추가		
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
