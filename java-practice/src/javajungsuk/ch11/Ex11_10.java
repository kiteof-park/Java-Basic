package javajungsuk.ch11;

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();
        
        // set의 크기가 6보다 작은 동안 1 ~ 45 사이의 난수 저장
        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println(set);    // 정렬되지 않은 상태로 출력

        // Set은 sort() 사용불가 -> sort의 매개변수는 List만 가능
        // Set은 집합 -> 순서X, 정렬 -> 순서를 부여
        // Set의 모든 요소를 List(ArrayList, LinkedList)로 옮기고 정렬 필요
        List list = new LinkedList(set);    // LinkedList(Collection c)
        Collections.sort(list);             // Collections.sort(List list)
        System.out.println(list);
    }
}
