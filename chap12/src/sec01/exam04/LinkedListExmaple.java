package sec01.exam04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExmaple {
	public static void main(String[] args) {
		// String 타입의 빈 LinkedList 생성
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println("[" + i + "] = " + list.get(i));
		}
		
		list.add(1, "LA");
		print(1, list);
		list.addFirst("런던"); // 첫 노드에 런던 추가
		print(2, list);
		list.addLast("서울"); // 마지막 노드에 서울 추가
		print(3, list);
		
		list.offer("파리"); // 리스트의 끝에 파리를 추가하고 true반환
		print(4, list);
		list.offerFirst("로마"); // 리스트의 첫 번째 노드로 로마 추가 후 true 반환
		print(5, list);
		list.offerLast("베른");
		print(6, list);
		
		System.out.println("7 : " + list.peek()); // 첫 번째 노드 추출
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast());
		
		list.poll(); // 첫 번째 노드 추출 후 list에서 삭제
		print(10, list);
		list.pollFirst(); 
		print(11, list);
		list.pollLast(); 
		print(12, list);
		
		list.push("제주");
		print(13, list);
		System.out.println("14 : " + list.pop()); // 첫 번째 노드 데이터 추출 후 삭제
		
		System.out.println("15 : " + list.get(3));
		System.out.println("16 : " + list.getFirst());
		System.out.println("17 : " + list.getLast());
		
		System.out.println("18 : " + list.indexOf("서울"));
		System.out.println("19 : " + list.lastIndexOf("서울"));
		
		list.removeFirst();
		print(20, list);
		list.removeLast();
		print(21, list);
		list.remove(3);
		print(22, list);
		list.remove("LA");
		print(23, list);
		
		List<String> list2 = Arrays.asList("북경", "상해");
		list.addAll(list2);
		
		Object obj[] = list.toArray(); // List 객체를 Object 타입의 일반 배열로 반환
		System.out.println("24 : " + Arrays.toString(obj));
		
		String cities[] = new String[0]; 
		cities = list.toArray(cities); // cities 타입 배열로 List 배열을 변환하여 반환
		System.out.println("25 : " + Arrays.toString(cities));
		
		System.out.println("25.2: " + list.toString());
		
		list.removeAll(list2);
		print(26, list);
	}
	
	private static void print(int n, List<String> list) {
		System.out.println(n + ": " + list.toString());
	}
}
