package sec03.chap06;

public class Ex08 {
    public static void main(String[] args) {
        String str1 = "가나다라마";
        String str2 = "010-1234-5678";
        String str3 = "하나 둘 셋 넷 다섯";

        // toCharArray()
        char[] chAry1 = str1.toCharArray();
        char[] chAry2 = str3
                .replace(" ", "")
                .toCharArray();

        // split()
        String[] strAry1 = str1.split("");
        String[] strAry2 = str2.split("-");
        String[] strAry3 = str3.split(" ");

        // 두 번째 매개변수는 배열 요소 갯수를 정함
        String[] strAry4 = str3.split(" ", 3);

    }
}
