package javajungsuk.ch11;

import java.util.Arrays;

public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4};
        int[] arr2 = {0, 1, 2, 3, 4};

        int[][] arr2d1 = {{1, 2}, {3, 4}};
        int[][] arr2d2 = {{3, 4}, {1, 2}};

        // 배열 출력
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr2d1));

        // 배열 비교
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr2d1, arr2d2));

        // 배열 복사
        int[] newArr1 = Arrays.copyOf(arr1, arr1.length);
        int[] newArr2 = Arrays.copyOf(arr1, 3);
        int[] newArr3 = Arrays.copyOf(arr1, 10);

        int[] newArr4 = Arrays.copyOfRange(arr1, 2, 4);
        int[] newArr5 = Arrays.copyOfRange(arr1, 0, 7);

        // 배열 채우기 - fill()
        int[] newArr7 = new int[5];
        Arrays.fill(newArr7, 519);

        int[] randomArr = new int[10];
        for(int i = 0; i < randomArr.length; i++){
            randomArr[i] = (int)(Math.random() * 10) + 1;
        }


        // 배열 채우기 - setAll(), 람다식을 이용
        // randomArr에 1 ~ 20 사이의 랜덤값으로 채움
        Arrays.setAll(randomArr, i -> (int)(Math.random()*20) +1);

        for(int num : randomArr){
            // randomArr의 원소값만큼 char[] 배열 생성
            char[] chArr = new char[num];
            
            // 생성된 char[] 배열에 '*'채워 넣기
            Arrays.fill(chArr, '*');
            
            // '*'로 채워진 char[]배열을 문자열로 바꾸고, num과 함께 출력
            // 참고로 char[]은 다른 타입 배열들과 달리 println()에서 문자열처럼 출력됨
            System.out.println(new String(chArr) + num);

            // num은 chArr.length와 같다
            System.out.println("chArr.length: " + chArr.length + ", " + "num: " + num);
        }

        // 배열 정렬
        Arrays.sort(randomArr);

        // 배열 검색
        int index = Arrays.binarySearch(randomArr, 3);
    }
}
