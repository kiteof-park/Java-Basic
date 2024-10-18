package sec04.chap03;

public class Ex03 {
    public static void main(String[] args) {
        // 4의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf4 = new int[count];

        for(int i=1, c=0; c<count; i++){
            if(i%4 == 0) multiOf4[c++] = i;
        }
        // 배열 순환(결과 출력)
        for(int i=0; i<multiOf4.length; i++){
            System.out.printf("%d ", multiOf4[i]);
        }

//        for (int num: multiOf4) {
//
//        }
    }
}
