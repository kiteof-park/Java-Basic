package javajungsuk.ch11;

import java.util.*;
import static java.util.Collections.*;          // Collections를 생략 가능



public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();

        addAll(list, 1,2,3,4,5);         // 💡 Collections.addAll()
        rotate(list, 2);                  // 오른쪽으로 두 칸씩 이동(회전)
        swap(list, 0 , 2);                   //  인덱스 0, 2 자리 교환(swap)
        shuffle(list);                            // 저장된 요소의 위치를 임의로 변경
        sort(list);                               // 정렬
        sort(list, reverseOrder());               // 역순 정렬, reverse(list)와 동일
        reverse(list);

        int idx = binarySearch(list, 3);      // 3이 저장된 위치(index)반환
        System.out.println("index of 3 : " + idx);

        System.out.println("max value of list : " + max(list));     // 최대값
        System.out.println("min value of list : " + min(list));     // 최소값
        System.out.println("min value of list : " + max(list, reverseOrder())); // 역순 정렬 방식의 최대값 -> 최소값

        fill(list, 9);                              // 리스트를 9로 채우기(fill)
        List newList = nCopies(list.size(), 2);      // list와 같은 크기의 새로운 리스트를 생성하고 2로 채움, 💡 변경 불가
        System.out.println(disjoint(list, newList));    // 공통 요소가 없으면 true

        copy(list, newList);                    //  newList를 list에 복사
        replaceAll(list, 2, 1);   //  list에서 2를 모두 1로 교체

        Enumeration e = enumeration(list);      // list에서 enumeration을 얻음(반복자)
        ArrayList list2 = list(e);
        System.out.println(list2);



    }
}
