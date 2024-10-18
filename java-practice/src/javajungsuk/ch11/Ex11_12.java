package javajungsuk.ch11;

import java.util.HashSet;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        HashSet set2 = new HashSet();

        set1.add("1");  set1.add("2");  set1.add("3");
        set1.add("4");  set1.add("5");  set1.add("6");

        set2.add("4");  set2.add("5");  set2.add("6");
        set2.add("7");  set2.add("8");  set2.add("9");

        set1.retainAll(set2);   // set1에서 set2에 포함된 요소만 남기고 나머지 제거
        set1.addAll(set2);      // set1에 set2의 모든 요소 추가(중복 제거)
        set1.removeAll(set2);   // set1에서 set2의 모든 요소를 제거

        System.out.println(set1);
    }
}
