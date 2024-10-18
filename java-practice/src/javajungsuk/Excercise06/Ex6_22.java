package javajungsuk.Excercise06;

public class Ex6_22 {
    static boolean isNumber(String str){
        int count = 0;

        // 주어진 문자열이 모두 숫자로 이루어져 있는지 확인
        // 문자열이 null이거나 빈 문자열이라면 false를 반환
//        if(str.isEmpty()) {
//            return false;
//        }

        if(str == null || str.isEmpty()){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            char s = str.charAt(i);
            if(!('0' <= s && s <= '9')) {
                break;
            }
            else {
                count ++;
            }
        }


        return count == str.length();

    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"은(는) 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str+"은(는) 숫자입니까? " + isNumber(str));
    }
}
