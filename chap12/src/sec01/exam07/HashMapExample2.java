package sec01.exam07;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Float> map = new HashMap<String, Float>();        
        //객체 저장
        map.put("손흥민", 95.7f);
        map.put("이강인", 94.5f);
        map.put("아이유", 97.5f);

        /* 1. entrySet을 이용한 Map 객체 읽기
         * - Map에 저장되어 있는 모든 Map.Entry를 Set으로 반환
         * - key와 value의 집합을 가져온다. */
        Set set = map.entrySet();
        Iterator it = set.iterator();
    
        while (it.hasNext()) {
        	Map.Entry entry = (Map.Entry) it.next();
        	System.out.println("이름: " + entry.getKey() + ", 성적: " 
                                      	+ entry.getValue() + "점");
        }
    
        /* 2. keySet을 이용한 Map 객체 읽기
         * - Map에 저장되어 있는 모든 key 객체를 반환 */
        set = map.keySet();
        System.out.println("학생 명단: " + set);
    
        for (String key : map.keySet()) {
        	System.out.println("key: " + key + ", value: " + map.get(key));
        }
        /* 3. values을 이용한 Map 객체 읽기
         * - Map에 저장되어 있는 모든 values 객체를 반환 */
        Collection<Float> values = map.values();    
    
        //총점 계산
        it = values.iterator();
        Float total = 0f;
    
        while (it.hasNext()) {
        	Float score = (Float) it.next();
        	total += score.floatValue();//Float --> float             
        }
        System.out.println("총점: " + total);
        System.out.println("평균: " + total/set.size());
        System.out.println("최고점수: " + Collections.max(values));
        System.out.println("최저점수: " + Collections.min(values));    
	}
}
