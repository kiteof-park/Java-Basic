package javajungsuk.ch11;

import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        // 순서 보장 ❌
        map.put("신영희", 100);
        map.put("박명철", 73);
        map.put("박수연", 85);
        map.put("박지연", 97);
        map.put("박의연", 99);

        //  💡 map의 모든 key-value(Entry)를 Set으로 반환
        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey()
                    + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;
        while(it.hasNext()){
            int i = (int)it.next();     // 오토박싱
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total / set.size());

        // 💡 max(), min() -> Comparable을 구현한 클래스 객체만 가능
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
