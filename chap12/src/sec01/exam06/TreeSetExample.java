package sec01.exam06;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("내부자들");
		treeSet.add("가문의영광");
		treeSet.add("밀정");
		treeSet.add("해운대");
		treeSet.add("태백산맥");
		treeSet.add("실미도");
		treeSet.add("변호인");
		treeSet.add("라이도스타");
		treeSet.add("가족의탄생");
		treeSet.add("검사외전");
		treeSet.add("동갑내기과외하기");
		 System.out.println(treeSet);
		
		/* TreeSet은 범위 검색에 유리
		 * - 전체 집합에서 "검"과 "실"사이의 요소를 탐색 (from ~ to)
		 * - subSet() : from~to 사이의 객체들을 반환
		 * - SortedSet<E> subSet(E fromElement, e toElement)
		 *  */
		System.out.println(treeSet.subSet("검", "실"));
		System.out.println("===================");
		
		// 학생 성적
		int[] score = {95, 87, 91, 80, 77, 93, 79, 81, 99, 83, 88, 90, 85, 97, 100};
		
		TreeSet<Integer> scoreSet = new TreeSet<Integer>();
		
		// 학생 성적 배열
		for (int i=0; i<score.length; i++) {
			scoreSet.add((score[i]));
		}
		System.out.println(scoreSet);
		
		/* 90 이상 검색
		 * - tailSet() : 주어진 객체보다 높은 객체들 반환 
		 * - SortedSet<E> tailSet(E fromElemnt)
		 * */
		System.out.println("90점 이상: " + scoreSet.tailSet(90));
		
		/* 80 미만 검색
		 * - headSet() : 주어진 객체보다 낮은 객체들 반환 
		 * - SortedSet<E> headSet(E fromElemnt)
		 * */
		System.out.println("80점 미만: " + scoreSet.headSet(80));
		
		/* 85점 이상 97점 미만
		 * - subSet() : from~to 사이의 객체들을 반환
		 * - SortedSet<E> subSet(E fromElemnt, E toElement)
		 * */
		System.out.println("85점 이상 97점 미만: " + scoreSet.subSet(85, 97));
		
	} // end of main
} // end of class