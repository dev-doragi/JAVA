package sec01.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();
		// list�� ���ڿ�(String) ��ü �߰�
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");

		// list�� ����� ��ü�� ���
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println("[" + i + "] = " + list.get(i));
		}
		
		// list�� ��ü �߰�
		list.add("����");
		list.add("�θ�");
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		// list�� ����� ��ü�� ���ڿ��� ��ȯ�Ͽ� ���
		System.out.println("1: " + list.toString());
		
		// list 1������ "LA" �߰�
		list.add(1, "LA");
		// print() �޼ҵ带 ȣ��(list�� ��� �����͸� ���ڿ��� ��ȯ �� ���)
		print(2, list);
		
		System.out.println("3: " + list.indexOf("����"));
		System.out.println("4: " + list.lastIndexOf("����"));
		
		System.out.println(list.remove("LA")); // �Ķ���ͷ� ������ Object ������ ���� �� true ��ȯ
		print(5, list);
		
		System.out.println(list.remove(2)); // 2�� �ε����� ��ü �����ϸ鼭 ��ȯ
		print(6, list);
		
		System.out.println("list.contains(\"LA\"); �� ��� ��");
		System.out.println("7: " + list.contains("LA"));
		
		Object[] obj = list.toArray();
		System.out.println("8: " + Arrays.toString(obj));
		
		for (int i = 0 ; i < obj.length; i++) {
			System.out.println("[" + i + "] = " + obj[i]);
		}
			
		String[] cities = new String[0];
		//ArrayList�� ����� ��� ��ü�� ������ Ÿ���� �迭�� cities�� �����Ͽ� ��ȯ, �Ķ���ʹ� Ÿ�� ������
		cities = list.toArray(cities);
		System.out.println("9: " + Arrays.toString(cities));
		
		// ArrayList�� ��� ������ ����
		list.clear();
		print(10, list);
		
		System.out.println("11: " + list.isEmpty());
		
		list.add("�����ī");
		list.add("����ŰŰ");
		list.add("����");
		list.add("�ĸ�");
		
		List<String> list2 = Arrays.asList("����", "����", "����");
		print(12, list2);
		
		list.addAll(list2);
		print(13, list);
		
		// containsAll() �޼���� list�� list2 �÷����� ������ ���ԵǾ� �ִ��� �Ǵ�
		System.out.println("14: " + list.containsAll(list2));
		
		// list.retainAll(list2)�� list���� list2 ���� ���� ���� ����, list2�� ����
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
		
		System.out.println(numList2.set(1, 7)); // 1��° �ε����� 7�� �ٲٴ� �Լ� set
		System.out.println("25: " + numList2.toString());
		Collections.sort(numList2);
		System.out.println("26: " + numList2.toString());
	}

	private static void print(int n, List<String> list) {
		System.out.println(n + ": " + list.toString());
	}

}
