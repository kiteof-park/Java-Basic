package sec06.chap08;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder strBld1 = new StringBuilder("한놈");
        strBld1.append("두시기");

        strBld1
                .append("석삼")
                .append("너구리")
                .append("다섯놈");

        String strBld1Out = strBld1.toString();
        System.out.println(strBld1Out);


        StringBuilder strBld2 = new StringBuilder("0123456789");

        String strBld2Out1 = strBld2.delete(3,7).toString();
        String strBld2Out2 = strBld2.deleteCharAt(3).toString();
        String strBld2Out3 = strBld2.insert(2, "ABC").toString();
        String strBld2Out4 = strBld2.replace(2, 4, "OneTwo").toString();
        String strBld2Out5 = strBld2.reverse().toString();
        String strBld2Out6 = strBld2.substring(2,5);

        String strBld2ChainOut = new StringBuilder("0123456789")
                .delete(3, 7)
                .deleteCharAt(3)
                .insert(2, "ABC")
                .replace(2, 4, "OneTwo")
                .reverse()
                .toString();

        StringBuilder strBld3 = new StringBuilder("ABCDEFG");
        int strBld3Cap = strBld3.capacity(); // 초기 문자열 + 16


        strBld3.setLength(100);
        strBld3Cap = strBld3.capacity();   // 저장 공간 수동 설정

    }
}
