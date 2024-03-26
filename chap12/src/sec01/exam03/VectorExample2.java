package sec01.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {
        //Vector 컬렉션 생성
        List<Board> list = new Vector<Board>();
        //List<Board> list = new ArrayList<Board>();
        
        //작업 스레드-A 생성
        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };
        
        //작업 스레드-B 생성
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };
        
        //작업 스레드 실행
        threadA.start();
        threadB.start();
        
        //작업 스레드들이 종료될 때까지 메인 스레드 대기
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("총 객체 수: " + list.size());
	}

}
