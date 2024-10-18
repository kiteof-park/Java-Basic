package sec04.chap07;

import java.util.Scanner;

public class Ex03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단어를 입력해주세요.");
        // 단어 입력
        while(sc.hasNext()){
            String nextWord = sc.next();
            if(nextWord.equalsIgnoreCase("quit")) break;
            System.out.println("입력값: " + nextWord);
        }

        System.out.println("문장를 입력해주세요.");
        // 문장 입력
        while(sc.hasNextLine()){
            String nextSentence = sc.nextLine();
            if(nextSentence.equalsIgnoreCase("quit")) break;
            System.out.println("입력값: " + nextSentence);
        }
        sc.close();
    }
}
