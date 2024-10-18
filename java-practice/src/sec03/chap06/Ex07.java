package sec03.chap06;

public class Ex07 {
    public static void main(String[] args) {
        String str1 = "슉-";
        String str2 = "슈슉-";
        String str3 = "슈슈슉-";

        String str4 = str1 + str2 + str3;
//        String str5 = str1.concat(str2);
        String str5 = str1
                .concat(str2)
                .concat(str3);
    }
}
