package sec01.exam08;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExmaple {

	public static void main(String[] args) {
        //TreeMap 컬렉션 생성
        TreeMap<Integer, String> users = new TreeMap<Integer, String>();
        //TreeMap 컬렉션에 Entry 객체(key-value) 저장
        users.put(20210101, "아이유");
        users.put(20220301, "김푸름");
        users.put(20180601, "박민지");
        users.put(20170801, "오정임");
        users.put(20160201, "손흥민");
        users.put(20190401, "이강인");
        users.put(20200701, "김유빈");
        users.put(20200301, "박현경");
        users.put(20150901, "김하늘");
        users.put(20230101, "황유미");
        System.out.println(users);
        
        Map.Entry<Integer, String> entry = null;
        entry = users.firstEntry();//첫번째(가장 작은 키) Entry 반환
        print("입사일자가 가장 빠른 사람 ", entry);
        entry = users.lastEntry();//가장 큰 키값의 Entry 반환
        print("입사일자가 가장 늦은 사람", entry);
        
        entry = users.higherEntry(20200101);//지정된 키보다 큰 값 중, 가장 작은 키값의 Entry 반환
        print("2020년도에 가장 빠르게 입사한 사람", entry);
        entry = users.lowerEntry(20201231);//지정된 키보다 작은 값 중, 가장 큰 키값의 Entry 반환
        print("2020년도에 가장 늦게 입사한 사람", entry);
        //모든 Entry를 반환한 후 삭제 
        while (!users.isEmpty()) {
            //TreeMap 맵의 가장 작은 키값의 Entry를 제거하면서 반환 
            entry = users.pollFirstEntry();
            print("퇴직한 사람", entry);
            System.out.println("남아있는 직원 수 : " + users.size());
        }
	}
	
	public static void print(String s, Map.Entry<Integer, String> entry) {
        System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
    }

}
