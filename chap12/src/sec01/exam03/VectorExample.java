package sec01.exam03;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		for (int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content  + "\t" + board.writer);
		}
		
		list.remove(2);
		list.remove(3);
		
		System.out.println("================================");
		
		// Iterator 객체 가져오기
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {
			Board board = iter.next();
			System.out.println(board.subject + "\t" + board.content  + "\t" + board.writer);
		}
	}
}
