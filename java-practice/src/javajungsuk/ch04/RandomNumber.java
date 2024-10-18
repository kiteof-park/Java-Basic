package javajungsuk.ch04;

public class RandomNumber {
    public static void main(String[] args) {
        // -5 ~ 5까지의 난수 20개 출력
//        for(int i = 0; i < 20; i++){
//            System.out.println((int)(Math.random()*11 - 5));
//        }

        // -2 ~ 6까지의 난수 20개 출력
        for(int i = 0; i < 20; i++){
            System.out.println((int)(Math.random() * 9 - 2));
        }
    }
}
