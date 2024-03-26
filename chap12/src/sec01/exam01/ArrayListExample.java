package sec01.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		// list에 문자열(String) 객체 추가
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		// list에 저장된 객체를 출력
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println("[" + i + "] = " + list.get(i));
		}
		
		// list에 객체 추가
		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");
		// list에 저장된 객체를 문자열로 반환하여 출력
		System.out.println("1: " + list.toString());
		
		// list 1번지에 "LA" 추가
		list.add(1, "LA");
		// print() 메소드를 호출(list의 모든 데이터를 문자열로 반환 후 출력)
		print(2, list);
		
		System.out.println("3: " + list.indexOf("서울"));
		System.out.println("4: " + list.lastIndexOf("서울"));
		
		System.out.println(list.remove("LA")); // 파라미터로 전달한 Object 있으면 삭제 후 true 반환
		print(5, list);
		
		System.out.println(list.remove(2)); // 2번 인덱스의 객체 삭제하면서 반환
		print(6, list);
		
		System.out.println("list.contains(\"LA\"); 의 결과 값");
		System.out.println("7: " + list.contains("LA"));
		
		Object[] obj = list.toArray();
		System.out.println("8: " + Arrays.toString(obj));
		
		for (int i = 0 ; i < obj.length; i++) {
			System.out.println("[" + i + "] = " + obj[i]);
		}
			
		String[] cities = new String[0];
		//ArrayList에 저장된 모든 객체를 지정된 타입의 배열인 cities에 저장하여 반환, 파라미터는 타입 지정용
		cities = list.toArray(cities);
		System.out.println("9: " + Arrays.toString(cities));
		
		// ArrayList의 모든 데이터 삭제
		list.clear();
		print(10, list);
		
		System.out.println("11: " + list.isEmpty());
		
		list.add("후쿠오카");
		list.add("와이키키");
		list.add("방콕");
		list.add("파리");
		
		List<String> list2 = Arrays.asList("서울", "뉴욕", "상해");
		print(12, list2);
		
		list.addAll(list2);
		print(13, list);
		
		// containsAll() 메서드는 list에 list2 컬렉션의 내용이 포함되어 있는지 판단
		System.out.println("14: " + list.containsAll(list2));
		
		// list.retainAll(list2)는 list에서 list2 내용 빼고 전부 삭제, list2만 남김
		list.retainAll(list2);
		print(15, list);
		
		list.removeAll(list2);
		print(16, list);
		
		System.out.println("======================================");
		
		List<Integer> numList = new ArrayList<>();
		numList.add(7);
		numList.add(3);
		numList.add(4);
		numList.add(1);
		numList.add(6);
		numList.add(2);
		numList.add(5);
		
		System.out.println("21: " + numList.toString());
		
		ArrayList<Integer> numList2  = new ArrayList<Integer>(numList.subList(2, 7));
		System.out.println("22: " + numList2.toString());
		
		Collections.sort(numList);
		Collections.sort(numList2, Collections.reverseOrder());
		System.out.println("23: " + numList.toString());
		System.out.println("24: " + numList2.toString());
		
		System.out.println(numList2.set(1, 7)); // 1번째 인덱스를 7로 바꾸는 함수 set
		System.out.println("25: " + numList2.toString());
		Collections.sort(numList2);
		System.out.println("26: " + numList2.toString());
	}

	private static void print(int n, List<String> list) {
		System.out.println(n + ": " + list.toString());
	}

}
