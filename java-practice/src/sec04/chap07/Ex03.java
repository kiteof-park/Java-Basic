package sec04.chap07;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Boolean을 입력해주세요");

        while(sc.hasNextBoolean()){
            System.out.println("입력값: " + sc.nextBoolean());
        }

        sc.close();
    }
}
