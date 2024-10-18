package sec04.chap03;

public class Ex04 {
    public static void main(String[] args) {
        //구구단 예제
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.println("%d * %d = %d".formatted(i,j,i*j));
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
            System.out.println("----------");
        }

        String[][] quotesInLangs = {
                {
                    "I am Princess",
                        "I am Queen",
                        "I am the best"
                },
                {
                    "나는 공주다",
                        "나는 여왕이다",
                        "나는 짱이다"
                }
        };

        // join 메소드로 동일한 결과 출력하기
        // join() - 배열을 문자열로 변환
        String[] strings = {"한놈", "두시기", "석삼", "너구리"};
        String string1 = String.join(" ", strings);
        System.out.println(string1);

        for (String[] quotes: quotesInLangs) {
            String string2 = String.join(" ", quotes);
            System.out.println(string2);
        }
    }
}
