package sec06.chap01;

public class ex01 {
    public static void main(String[] args) {

        {
            int intNum = 123;
            String str = "블록 밖은 위험해";
        }

//        intNum = 234;
//        System.out.println(str);

        String x = "전국구 보스";

        {
            String y = "동네 양아치";

            //  💡 블록 안쪽에서는 바깥의 것 사용 가능
            System.out.println(x);
            System.out.println(y);
        }

        System.out.println(x);
//        System.out.println(y); // ⚠️ 불가

    }

}
