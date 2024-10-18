package devcamp.starExample;

public class Ex03 {
    public static void main(String[] args) {
        String space = " ";

        /*
        * 역순
        * for()조건식을 내림차순으로 설정해주고 2번 문제 코드와 동일하게 작성
        */
        for(int i =5; i > 0; i--){
            System.out.print(space.repeat(i) + "*");
            System.out.println();
        }
    }
}
