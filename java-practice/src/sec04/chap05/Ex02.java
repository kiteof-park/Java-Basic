package sec04.chap05;

public class Ex02 {
    static int add (int num1, int num2){
        return num1 + num2;
    }

    static boolean cheIfContain (String text, String tocken){
        // text가 tocken 포함 여부를 반환
        return text.toLowerCase().contains(tocken.toLowerCase());
    }

    public static void main(String[] args) {
//        int int1 = add(2,3);
//        System.out.println(int1);
//
//        System.out.println(add(4,5));
//
//        int int2 = add(add(6,7), add(8,9));
//        System.out.println(int2);

        if(cheIfContain("Hello World", "hello")){
            System.out.println("포함됨");
        } else {
            System.out.println("포함안됨");
        }

        System.out.println(
                cheIfContain("Hello World", "hello")
                ? "포함됨" : "포함안됨"
        );
    }
}
