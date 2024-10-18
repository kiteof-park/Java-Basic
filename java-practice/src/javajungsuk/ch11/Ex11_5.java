package javajungsuk.ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // HashSet list = new HashSet();

        // 참조변수를 Colleciton c로 선언하면 변경에 유리
        // Collection c = new HashSet();
        // Collection c = new TreeSet();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        // Iterator는 이동하면서 다음 요소를 가리킴
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
            // list의 끝에서 Iterator가 가리키는 객체는 null -> 일회용
            // 사용이 끝나면 새로운 Iterator 객체를 얻어와야 한다.
        }

        // ArrayList를 HashSet으로 바꾸면 for문은 동작하지 않는다.
        // HashSet에는 get() 메서가 없거든
        for(int i = 0; i < list.size(); i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }

    }
}
