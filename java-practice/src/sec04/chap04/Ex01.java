package sec04.chap04;

public class Ex01 {
    public static void main(String[] args) {
        double popInBillion = 7.837;

        //  ⭐️ break 를 통한 반복 탈출
        while (true) {
            System.out.println("세계인구: " + (popInBillion -= 0.1));
            if (popInBillion <= 0) break;

            System.out.println("인간의 욕심은 끝이 없고");
            System.out.println("같은 실수를 반복한다.");
        }

        System.out.println("인류 멸종");

    }
}
