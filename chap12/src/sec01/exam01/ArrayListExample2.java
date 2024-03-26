package sec01.exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		
		// for문을 이용한 데이터 반복처리
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=============");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
