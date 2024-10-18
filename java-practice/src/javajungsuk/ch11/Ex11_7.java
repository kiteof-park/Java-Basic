package javajungsuk.ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        // 기본 정렬 기준 - String의 Comparable구현에 의한 정렬(String 클래스가 가진 정렬 기준)
        // 문자열의 기본 정렬 기준 - 사전 순서(가나다, ABC)
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        // 기본 정렬 기준 - String 클래스의 Comparator
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);     // 대소문자 구분안함
        System.out.println(Arrays.toString(strArr));

        // 정렬 기준 - Compartor를 직접 구현, 역순 정렬
        Arrays.sort(strArr, new Descending());
    }
}

// 정렬 기준을 직접 구현 - Comparator
class Descending implements Comparator {
    public int compare(Object obj1, Object obj2){
        if(obj1 instanceof Comparable && obj2 instanceof Comparable){
            Comparable c1  = (Comparable)obj1;
            Comparable c2  = (Comparable)obj2;
            return c1.compareTo(c2) * -1;   // -1을 곱해 String의 기본 정렬 방식을 역으로 변경
                                            // c2.compareTo(c1) 로 순서를 바꿔도 가능
        }
        return -1;
    }
}


