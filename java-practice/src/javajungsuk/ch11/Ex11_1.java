package javajungsuk.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity)가 10인 ArrayList 생성
        ArrayList list1 = new ArrayList(10);

        // ArrayList에는 객체만 저장 가능
        // Obejct배열 -> 주소값을 저장하는 배열(객체 배열)
//        list1.add(Integer.valueOf(5));
//        list1.add(Integer.valueOf(4));
//        list1.add(Integer.valueOf(2));
//        list1.add(Integer.valueOf(0));
//        list1.add(Integer.valueOf(1));
//        list1.add(Integer.valueOf(3));

        // 오토 박싱
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        // subList()에 의해 만들어진 리스트는 읽기 전용
        // ArrayList(Collection c) 생성자로 생성됨
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        /*
         * List sub = list1.subList(1,4);
         * ArrayList list2 = new ArrayList(sub);
         */
        System.out.println(list1);
        System.out.println(list2);

        // 정렬
        // Collection은 인터페이스, Collections는 클래스(Collection을 다루는데 필요한 메서드)
        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1);
        System.out.println(list2);

        // 포함 여부 확인 - contains(), containsAll()
        System.out.println(list1.containsAll(list2));

        // 추가 - add
        list2.add("B");
        list2.add("C");                           // [0, 2, 4, B, C]
        list2.add(3, "A");          // [0, 2, 4, A, B, C]

        // 변경 - set
        list2.set(3, "AA");                       // [0, 2, 4, AA, B, C]

        // 검색 후 인덱스 반환 - indexOf()
        list1.add(0,"1");           // [1, 0, 1, 2, 3, 4, 5]
        System.out.println(list1.indexOf("1"));   // 0 (String "1"의 인덱스)
        System.out.println(list1.indexOf(1));     // 2 (Integer 1의 인덱스)

        // 삭제 - remove
        list1.remove(0);                    // [0, 1, 2, 3, 4, 5]
        list1.remove(Integer.valueOf(1));      // [0, 2, 3, 4, 5]

        // 교집합은 남겨두고 모두 제거 - retainAll
        System.out.println(list1);      // [0, 2, 3, 4, 5]
        System.out.println(list2);      // [0, 2, 4, AA, B, C]

        // list2와 교집합을 남기고 list1의 나머지 요소 삭제
        list1.retainAll(list2);

        System.out.println(list1);      // [0, 2, 4]
        System.out.println(list2);      // [0, 2, 4, AA, B, C]

        // list1과 교집합을 남기고 list2의 나머지 요소 삭제
//        list2.retainAll(list1);
//        System.out.println(list1);      // [0, 2, 4]
//        System.out.println(list2);      // [0, 2, 4]

        // list2에서 list1에 포함된 객체 삭제
        for(int i = 0; i < list2.size(); i++){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }

    }
}
