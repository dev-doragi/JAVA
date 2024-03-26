package sec01.exam04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExmaple {
	public static void main(String[] args) {
		// String Ÿ���� �� LinkedList ����
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println("[" + i + "] = " + list.get(i));
		}
		
		list.add(1, "LA");
		print(1, list);
		list.addFirst("����"); // ù ��忡 ���� �߰�
		print(2, list);
		list.addLast("����"); // ������ ��忡 ���� �߰�
		print(3, list);
		
		list.offer("�ĸ�"); // ����Ʈ�� ���� �ĸ��� �߰��ϰ� true��ȯ
		print(4, list);
		list.offerFirst("�θ�"); // ����Ʈ�� ù ��° ���� �θ� �߰� �� true ��ȯ
		print(5, list);
		list.offerLast("����");
		print(6, list);
		
		System.out.println("7 : " + list.peek()); // ù ��° ��� ����
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast());
		
		list.poll(); // ù ��° ��� ���� �� list���� ����
		print(10, list);
		list.pollFirst(); 
		print(11, list);
		list.pollLast(); 
		print(12, list);
		
		list.push("����");
		print(13, list);
		System.out.println("14 : " + list.pop()); // ù ��° ��� ������ ���� �� ����
		
		System.out.println("15 : " + list.get(3));
		System.out.println("16 : " + list.getFirst());
		System.out.println("17 : " + list.getLast());
		
		System.out.println("18 : " + list.indexOf("����"));
		System.out.println("19 : " + list.lastIndexOf("����"));
		
		list.removeFirst();
		print(20, list);
		list.removeLast();
		print(21, list);
		list.remove(3);
		print(22, list);
		list.remove("LA");
		print(23, list);
		
		List<String> list2 = Arrays.asList("�ϰ�", "����");
		list.addAll(list2);
		
		Object obj[] = list.toArray(); // List ��ü�� Object Ÿ���� �Ϲ� �迭�� ��ȯ
		System.out.println("24 : " + Arrays.toString(obj));
		
		String cities[] = new String[0]; 
		cities = list.toArray(cities); // cities Ÿ�� �迭�� List �迭�� ��ȯ�Ͽ� ��ȯ
		System.out.println("25 : " + Arrays.toString(cities));
		
		System.out.println("25.2: " + list.toString());
		
		list.removeAll(list2);
		print(26, list);
	}
	
	private static void print(int n, List<String> list) {
		System.out.println(n + ": " + list.toString());
	}
}
