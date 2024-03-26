package sec01.exam05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// String 객체를 저장하는 HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		// 컬렉션에 문자열 객체 추가
		set.add("인공지능");
		set.add("메타버스");
		set.add("클라우드 컴퓨팅");
		set.add("슈퍼앱");
		set.add("슈퍼앱");

		// Set 컬렉션 사이즈
		System.out.println("컬렉션에 저장된 객체의 수: " + set.size());
		
		// Set 컬렉션에 저장된 객체를 가져와 처리하기
		// 1. 향상된 for문 사용하기
		for (String element : set) {
			System.out.println(element);
		}
		System.out.println();
		
		// 2. Iterator 인터페이스 구현객체를 이용(권장)
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String element = it.next();
			
			if (element.equals("메타버스")) {
				System.out.println(element + " 객체가 삭제되었습니다.");
				it.remove();
			}
		} // end of while
		System.out.println();
		System.out.println("컬렉션에 저장된 객체 수 : " + set.size());
		
		// 컬렉션의 Iterator 가져오기
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	} // end of main
} // end of class