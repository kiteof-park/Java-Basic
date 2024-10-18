package devcamp.arrayExample;

import java.util.Arrays;

public class MethodExample {
    /*
     * 1. 3개의 정수를 받아서 중간 크기의 값을 반환하는 mid()
     * System.out.println(mid(1,2,3)) // 2
     * System.out.println(mid(1,3,2)) // 2
     * System.out.println(mid(1,1,1)) // 1
     * System.out.println(mid(1,2,3)) // 2
     * */
    public static int mid(int num1, int num2, int num3){
        int midNum = 0;
        int[] arr = new int[]{num1, num2, num3};

        // 크기 순 정렬
        Arrays.sort(arr);

        // 가운데 인덱스 출력
        midNum = arr[arr.length/2];

        return midNum;
    }

    /*
     * 2. 5 x 5의 빙고판을 받아서 빙고 갯수를 반환하는 bingoCount()
     * 빙고룰 그대로 적용한다.
     * int[][] bingo = {
     *         {0, 0, 0, 0, 0},
     *         {1, 1, 1, 1, 1},
     *         {0, 0, 0, 0, 0},
     *         {1, 1, 1, 1, 1},
     *         {0, 0, 0, 0, 0}
     *   };
     * int cnt = bingoCount(bingo);
     * System.out.println(cnt);
     * */
    public static int bingo(int[][] arr){
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mid(1,2,3));
        System.out.println(mid(1,3,2));
        System.out.println(mid(1,1,1));
        System.out.println(mid(1,2,2));



    }

}
