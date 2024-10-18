package javajungsuk.ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4","4" };
        Set set = new HashSet();
        
        for(int i = 0; i < objArr.length; i++){
            // HashSet에 objArr의 요소들을 저장 - 중복된 요소 제거, 순서 유지 보장 안됨
            set.add(objArr[i]);
        }

        System.out.println(set);            // HashSet에 저장된 요소 출력

        Iterator it = set.iterator();       // HashSet에 저장된 요소 출력 - Iterator이용
        while(it.hasNext()){
            System.out.print(it.next());    // 순서를 보장하며 출력하지 않음
        }
    }
}
