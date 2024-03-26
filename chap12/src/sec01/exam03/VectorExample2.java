package sec01.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {
        //Vector �÷��� ����
        List<Board> list = new Vector<Board>();
        //List<Board> list = new ArrayList<Board>();
        
        //�۾� ������-A ����
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("����"+i, "����"+i, "�۾���"+i));
                }
            }
        };
        
        //�۾� ������-B ����
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("����"+i, "����"+i, "�۾���"+i));
                }
            }
        };
        
        //�۾� ������ ����
        threadA.start();
        threadB.start();
        
        //�۾� ��������� ����� ������ ���� ������ ���
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("�� ��ü ��: " + list.size());
	}

}
