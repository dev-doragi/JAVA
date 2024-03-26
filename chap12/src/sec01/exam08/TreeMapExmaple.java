package sec01.exam08;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExmaple {

	public static void main(String[] args) {
        //TreeMap �÷��� ����
        TreeMap<Integer, String> users = new TreeMap<Integer, String>();
        //TreeMap �÷��ǿ� Entry ��ü(key-value) ����
        users.put(20210101, "������");
        users.put(20220301, "��Ǫ��");
        users.put(20180601, "�ڹ���");
        users.put(20170801, "������");
        users.put(20160201, "�����");
        users.put(20190401, "�̰���");
        users.put(20200701, "������");
        users.put(20200301, "������");
        users.put(20150901, "���ϴ�");
        users.put(20230101, "Ȳ����");
        System.out.println(users);
        
        Map.Entry<Integer, String> entry = null;
        entry = users.firstEntry();//ù��°(���� ���� Ű) Entry ��ȯ
        print("�Ի����ڰ� ���� ���� ��� ", entry);
        entry = users.lastEntry();//���� ū Ű���� Entry ��ȯ
        print("�Ի����ڰ� ���� ���� ���", entry);
        
        entry = users.higherEntry(20200101);//������ Ű���� ū �� ��, ���� ���� Ű���� Entry ��ȯ
        print("2020�⵵�� ���� ������ �Ի��� ���", entry);
        entry = users.lowerEntry(20201231);//������ Ű���� ���� �� ��, ���� ū Ű���� Entry ��ȯ
        print("2020�⵵�� ���� �ʰ� �Ի��� ���", entry);
        //��� Entry�� ��ȯ�� �� ���� 
        while (!users.isEmpty()) {
            //TreeMap ���� ���� ���� Ű���� Entry�� �����ϸ鼭 ��ȯ 
            entry = users.pollFirstEntry();
            print("������ ���", entry);
            System.out.println("�����ִ� ���� �� : " + users.size());
        }
	}
	
	public static void print(String s, Map.Entry<Integer, String> entry) {
        System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
    }

}
