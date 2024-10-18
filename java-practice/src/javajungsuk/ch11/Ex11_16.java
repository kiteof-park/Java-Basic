package javajungsuk.ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("euiyeon", "1234");
        map.put("jiyeon", "1111");
        map.put("jiyeon", "1234");  // 동일한 key에 대해 새로운 value로 덮어써짐

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("id와 password를 입력하세요.");
            System.out.print("id: ");
            String id = sc.nextLine().trim();

            System.out.print("password: ");
            String password = sc.nextLine().trim();

            // map에 id(key)가 있는지 확인
            if(!map.containsKey(id)){
                System.out.println("❌입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

           // 이렇게 작성하면 해당id에 대한 password검사가 아니라, 그냥 그 password가 map에 있는지를 확인하는거
//            if(!map.containsValue(password)){
//                System.out.println("❌비밀번호가 일치하지 않습니다. 다시 입력해주세요");
//            }

            // map에 id와 value가 일치하는지 확인 (id-value 일치?)
            // 💡 get(key)는 주어진 key에 대한 value를 반환
            if(!(map.get(id)).equals(password)){
                System.out.println("❌비밀번호가 일치하지 않습니다. 다시 입력해주세요");
            }
            else{
                System.out.println("\uD83C\uDF89로그인 성공\uD83C\uDF89");
                break;
            }
        }
    }
}
