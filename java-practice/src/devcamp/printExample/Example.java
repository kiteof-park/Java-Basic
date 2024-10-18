package devcamp.printExample;

public class Example {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d, %2d, %2d, %2d, %2d, %2d, %2d%n",
                    /*
                    4번 문제(반복) 123 -> 111, 456 -> 222, 789 -> 333


                    5번 문제(순환) 123 -> 123, 456 -> 123, 789 -> 123
                    (i+2) % 3 + 1
                    */

                    i, (i*2), (i*2-1), (i*i), ((i-1)/3 +1),(i % 3 == 0 ? 3 : i % 3 ), (10-i)

            );
        }


    }
}
