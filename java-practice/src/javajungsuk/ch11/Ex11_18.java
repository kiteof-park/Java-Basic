package javajungsuk.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = {"C", "A", "F", "A", "T", "M", "L", "T", "B", "A"};

        HashMap map = new HashMap();
        
        for(int i = 0; i < data.length; i++){
            // 해당 알파벳이 map에 있으면 value를 증가
            if(map.containsKey(data[i])){
                int value = (int)map.get(data[i]);
                map.put(data[i], value + 1);
            }
            // 해당 알파벳이 map에 없으면 map에 추가
            else{
                map.put(data[i], 1);
            }
        }
        
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            // key-value 한 쌍의 엔트리를 읽어옴
            Map.Entry entry = (Map.Entry)it.next();
            
            // 해당 엔트리의 값을 value에 저장
            int value = (int)entry.getValue();

            System.out.println(entry.getKey() + " : "
                    + "#".repeat(value)
                    + " " +value);
            System.out.println(entry.getKey() + " : "
                    + "#".repeat(value)
                    + " " +value);
        }
    }
}
