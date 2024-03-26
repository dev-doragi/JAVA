package sec01.exam07;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
        //Map �÷��� ����
        Map<String, Float> map = new HashMap<String, Float>();        
        //��ü ����
        map.put("�����", 95.7f);
        map.put("�̰���", 94.5f);
        map.put("������", 97.5f);

        /* 1. entrySet�� �̿��� Map ��ü �б�
         * - Map�� ����Ǿ� �ִ� ��� Map.Entry�� Set���� ��ȯ
         * - key�� value�� ������ �����´�. */
        Set set = map.entrySet();
        Iterator it = set.iterator();
    
        while (it.hasNext()) {
        	Map.Entry entry = (Map.Entry) it.next();
        	System.out.println("�̸�: " + entry.getKey() + ", ����: " 
                                      	+ entry.getValue() + "��");
        }
    
        /* 2. keySet�� �̿��� Map ��ü �б�
         * - Map�� ����Ǿ� �ִ� ��� key ��ü�� ��ȯ */
        set = map.keySet();
        System.out.println("�л� ���: " + set);
    
        for (String key : map.keySet()) {
        	System.out.println("key: " + key + ", value: " + map.get(key));
        }
        /* 3. values�� �̿��� Map ��ü �б�
         * - Map�� ����Ǿ� �ִ� ��� values ��ü�� ��ȯ */
        Collection<Float> values = map.values();    
    
        //���� ���
        it = values.iterator();
        Float total = 0f;
    
        while (it.hasNext()) {
        	Float score = (Float) it.next();
        	total += score.floatValue();//Float --> float             
        }
        System.out.println("����: " + total);
        System.out.println("���: " + total/set.size());
        System.out.println("�ְ�����: " + Collections.max(values));
        System.out.println("��������: " + Collections.min(values));    
	}
}
