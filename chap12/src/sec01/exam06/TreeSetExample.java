package sec01.exam06;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("�����ڵ�");
		treeSet.add("�����ǿ���");
		treeSet.add("����");
		treeSet.add("�ؿ��");
		treeSet.add("�¹���");
		treeSet.add("�ǹ̵�");
		treeSet.add("��ȣ��");
		treeSet.add("���̵���Ÿ");
		treeSet.add("������ź��");
		treeSet.add("�˻����");
		treeSet.add("������������ϱ�");
		 System.out.println(treeSet);
		
		/* TreeSet�� ���� �˻��� ����
		 * - ��ü ���տ��� "��"�� "��"������ ��Ҹ� Ž�� (from ~ to)
		 * - subSet() : from~to ������ ��ü���� ��ȯ
		 * - SortedSet<E> subSet(E fromElement, e toElement)
		 *  */
		System.out.println(treeSet.subSet("��", "��"));
		System.out.println("===================");
		
		// �л� ����
		int[] score = {95, 87, 91, 80, 77, 93, 79, 81, 99, 83, 88, 90, 85, 97, 100};
		
		TreeSet<Integer> scoreSet = new TreeSet<Integer>();
		
		// �л� ���� �迭
		for (int i=0; i<score.length; i++) {
			scoreSet.add((score[i]));
		}
		System.out.println(scoreSet);
		
		/* 90 �̻� �˻�
		 * - tailSet() : �־��� ��ü���� ���� ��ü�� ��ȯ 
		 * - SortedSet<E> tailSet(E fromElemnt)
		 * */
		System.out.println("90�� �̻�: " + scoreSet.tailSet(90));
		
		/* 80 �̸� �˻�
		 * - headSet() : �־��� ��ü���� ���� ��ü�� ��ȯ 
		 * - SortedSet<E> headSet(E fromElemnt)
		 * */
		System.out.println("80�� �̸�: " + scoreSet.headSet(80));
		
		/* 85�� �̻� 97�� �̸�
		 * - subSet() : from~to ������ ��ü���� ��ȯ
		 * - SortedSet<E> subSet(E fromElemnt, E toElement)
		 * */
		System.out.println("85�� �̻� 97�� �̸�: " + scoreSet.subSet(85, 97));
		
	} // end of main
} // end of class