package sec04.chap04;

public class Ex04 {
    public static void main(String[] args) {

        int lineWidth = 5;

        while (lineWidth > 0){
            int startsToPrint = lineWidth--;
            while(startsToPrint-- > 0){
                System.out.printf("*");
            }
            System.out.println();
        }

        for(int i = lineWidth; i > 0; i--){
            for(int j =i; i>0; j--){
                System.out.println("@");
            }
            System.out.println();
        }


        while(lineWidth > 0){
            System.out.printf("*".repeat(lineWidth));
            System.out.println();

            lineWidth--;
        }
    }
}
