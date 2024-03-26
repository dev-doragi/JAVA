package sec01.exam04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 1. ArrayList
		startTime = System.currentTimeMillis();
		for (int i=0; i<=20000; i++) {
			// i ���� ���ڿ��� ����ȯ (null�� ��� ���ڿ� 'null'�� ��ȯ)
			list1.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList �ɸ��ð�: " + (endTime - startTime) + " ms");
		
		// 2. LinkedList
		startTime = System.currentTimeMillis();
		for (int i=0; i<=20000; i++) {
			// i ���� ���ڿ��� ����ȯ (null�� ��� ���ڿ� 'null'�� ��ȯ)
			list2.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList �ɸ��ð�: " + (endTime - startTime) + " ms");
	}

}
