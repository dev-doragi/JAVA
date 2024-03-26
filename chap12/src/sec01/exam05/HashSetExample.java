package sec01.exam05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// String ��ü�� �����ϴ� HashSet �÷��� ����
		Set<String> set = new HashSet<String>();
		
		// �÷��ǿ� ���ڿ� ��ü �߰�
		set.add("�ΰ�����");
		set.add("��Ÿ����");
		set.add("Ŭ���� ��ǻ��");
		set.add("���۾�");
		set.add("���۾�");

		// Set �÷��� ������
		System.out.println("�÷��ǿ� ����� ��ü�� ��: " + set.size());
		
		// Set �÷��ǿ� ����� ��ü�� ������ ó���ϱ�
		// 1. ���� for�� ����ϱ�
		for (String element : set) {
			System.out.println(element);
		}
		System.out.println();
		
		// 2. Iterator �������̽� ������ü�� �̿�(����)
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String element = it.next();
			
			if (element.equals("��Ÿ����")) {
				System.out.println(element + " ��ü�� �����Ǿ����ϴ�.");
				it.remove();
			}
		} // end of while
		System.out.println();
		System.out.println("�÷��ǿ� ����� ��ü �� : " + set.size());
		
		// �÷����� Iterator ��������
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	} // end of main
} // end of class